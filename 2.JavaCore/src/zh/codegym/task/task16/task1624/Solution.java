package zh.codegym.task.task16.task1624;

/* 
连续线程
*/

public class Solution {

    public static MyThread t = new MyThread();
    static String message = "在 main 内";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ignored) {
        }
    }

    static class MyThread extends Thread {
        String message = "在 MyThread 内";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}