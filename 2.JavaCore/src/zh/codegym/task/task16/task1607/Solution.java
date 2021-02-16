package zh.codegym.task.task16.task1607;

import java.util.ArrayList;
import java.util.List;

/* 
赛马
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;

        for (int i = 0 ; i < horses.size() ; i++){
            Horse horse = horses.get(i);
            if (horse.isFinished()){
                finishedCount++;
            }else {
                System.out.println("正在等待 " + horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // 延迟
                s += "" + i;
                if (i == 1000) {
                    s = " 已完成比赛！";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
