package zh.codegym.task.task16.task1612;

/* 
秒表
*/

import sun.awt.windows.ThemeReader;

public class Solution {

    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner usain = new Runner("尤塞恩", 4);
        Runner carl = new Runner("卡尔", 2);
        // 各就各位！
        // 预备！
        // 跑！
        usain.start();
        carl.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {

        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            Thread.sleep(1000 / owner.getSpeed()); //计算每步需要花费的时间
            System.out.println(owner.getName() + " 跑步 " + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}
