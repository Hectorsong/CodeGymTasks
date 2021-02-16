package zh.codegym.task.task16.task1617;

/* 
比赛倒计时
*/

public class Solution {

    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (numSeconds > 0){
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                }
                System.out.print("跑！");
            } catch (InterruptedException e){
                System.out.print("已中断！");
            }
        }
    }
}
