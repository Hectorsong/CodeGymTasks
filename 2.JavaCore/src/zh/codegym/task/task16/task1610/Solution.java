package zh.codegym.task.task16.task1610;

/* 
安排 join() 调用
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("米西");
        cat1.join();
        Cat cat2 = new Cat("可可");
        cat2.join();
/*        Kitten kitten1 = new Kitten("kitten1");
        kitten1.join();
        Kitten kitten2 = new Kitten("kitten2");
        kitten2.join();
        Kitten kitten3 = new Kitten("kitten3");
        kitten3.join();
        Kitten kitten4 = new Kitten("kitten4");
        kitten4.join();*/
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Cat extends Thread {

        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kitten 1 (mother - " + getName() + ")");
            kitten2 = new Kitten("Kitten 2 (mother - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " 生出 2 只小猫");
            try {
                initAllKittens();
            } catch (InterruptedException ignored) {
            }
            System.out.println(getName() + ":所有小猫都在篮子里。" + getName() + " 将小猫放回");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " 爬出篮子");
            investigateWorld();
        }
    }
}
