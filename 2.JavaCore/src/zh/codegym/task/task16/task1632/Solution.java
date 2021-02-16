package zh.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Thread1();
        threads.add(thread1);
        Thread thread2 = new Thread2();
        threads.add(thread2);
        Thread thread3 = new Thread3();
        threads.add(thread3);
        Thread thread4 = new Thread4();
        threads.add(thread4);
        Thread thread5 = new Thread5();
        threads.add(thread5);
    }
    public static void main(String[] args) {

/*        thread5.start();*/
/*        for (Thread element: threads) {
            element.start();
        }*/
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true) {
                int a = 1;
            }
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    sleep(100);
                } catch (InterruptedException e){
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("加油");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!isInterrupted()){
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread{

        private static int sumNumber;
        @Override
        public void run() {
            while (true){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String str = br.readLine();;
                    if (!str.equals("N")) {
                        int temp = Integer.parseInt(str);
                        sumNumber = sumNumber + temp;
                    }else {
                        System.out.println(sumNumber);
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}