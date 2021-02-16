package zh.codegym.task.task16.task1619;

/* 
无中断，没门？
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(1000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        TestThread.cancel = true;
    }

    public static class TestThread implements Runnable {
        static boolean cancel = false;
        public void run() {
            while (!cancel) {
                try {
                    System.out.println("呵呵");
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
