package zh.codegym.task.task16.task1626;

public class Solution {

    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "减少").start();
        new Thread(new CountUpRunnable(), "增加").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countUpIndex = 1;
        @Override
        public void run() {
            try {
                while (countUpIndex <= 5){
                    System.out.println(toString());
                    Thread.sleep(500);
                    countUpIndex++;
                }
            } catch (InterruptedException e){
            }
        }

        public String toString(){
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }
    }


    public static class CountdownRunnable implements Runnable {

        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException ignored) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }

}
