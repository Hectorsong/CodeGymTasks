package zh.codegym.task.task16.task1611;

/* 
时钟
*/

public class Solution {

    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("时钟已停止");
        Thread.sleep(2000);
        System.out.println("仔细检查");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTickTock() throws InterruptedException {
            System.out.println("嘀嘀");
            Thread.sleep(500);
            System.out.println("哒哒");
            Thread.sleep(500);
        }
    }
}
