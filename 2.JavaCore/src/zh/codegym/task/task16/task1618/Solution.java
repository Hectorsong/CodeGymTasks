package zh.codegym.task.task16.task1618;

/* 
另一个中断
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new TestThread();
        testThread.start();
        Thread.sleep(2000);
        testThread.interrupt();


/*        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10000);
        clockThread.interrupt();*/

    }

    //在此编写你的代码
    public static class TestThread extends Thread implements Runnable{
        private int time;
        public void run(){
            Thread current = Thread.currentThread();
            try {
                while (!current.interrupted()){
                    Thread.sleep(1000);
                    time++;
                    System.out.println("测试线程运行 " + time + "秒");
                }
            }catch (InterruptedException e){
            }
        }
    }
/*    static class Clock implements Runnable
    {
        private int time;
        public void run() {
            Thread current = Thread.currentThread();
            try {
                while (!current.isInterrupted())
                {
                    Thread.sleep(1000);
                    time++;
                    System.out.println("时钟线程运行 " + time + "秒");
                }
            } catch (InterruptedException e){
            }
        }
    }*/
}
