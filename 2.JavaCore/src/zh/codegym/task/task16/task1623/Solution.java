package zh.codegym.task.task16.task1623;

/* 
以递归方式创建线程
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread(){
            super("" + ++createdThreadCount);
            start();
        }

        public void run(){
            if (createdThreadCount < Solution.count){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return /*Thread.currentThread().*/getName() + " 已创建";
        }
    }
}
