package zh.codegym.task.task16.task1602;

/* 
我的第二个线程
*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("这是 TestThread 内的 static 块");
        }
        public void run(){
            System.out.println("这是 run 方法");
        }
    }

}


