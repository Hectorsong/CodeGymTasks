package zh.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
一个列表和几个线程
*/

public class Solution {

    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
            list.get(i).run();
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("这是 SpecialThread 内的 run 方法");
        }
    }
}
