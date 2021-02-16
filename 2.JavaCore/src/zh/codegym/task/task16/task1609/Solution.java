package zh.codegym.task.task16.task1609;

/* 
公平
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
//        alpha.join();
        Mouse mouse1 = new Mouse("#2");
//        mouse1.join();
        Mouse mouse2 = new Mouse("#3");
//        mouse2.join();
//        alpha.join();
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " 开始吃东西");
            eat();
            System.out.println(getName() + " 已经吃完");
        }
    }
}
