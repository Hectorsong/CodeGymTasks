package zh.codegym.task.task16.task1613;

/* 
大本钟
*/

public class Solution {

    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("伦敦", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {

        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void printTime() throws InterruptedException {
            Thread.sleep(1000);
            seconds++;
            if (seconds == 60){
                seconds = 0;
                minutes++;
                if (minutes == 60){
                    minutes = 0;
                    hours++;
                    if (hours == 24){
                        hours = 0;
                    }
                }
            }

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("当前是%s的午夜！", cityName));
            } else {
                System.out.println(String.format("在%s，时间现在是 %02d:%02d:%02d！", cityName, hours, minutes, seconds));
            }
        }
    }
}
