package zh.codegym.task.task17.task1718;
/* 
熨衣服
*/
public class Solution {

    public static void main(String[] args) {
        Person diana = new Person("戴安娜");
        Person steve = new Person("史蒂夫");
        diana.start();
        steve.start();
    }

    public static class Person extends Thread {
        public Person(String name) {
            super(name);
        }
        @Override
        public void run() {
            synchronized (Iron.class){
                Iron iron = takeIron();
                Clothes clothes = takeClothes();
                iron(iron, clothes);
                returnIron();
            }
        }
        protected synchronized Iron takeIron() {
            System.out.println("正在使用熨斗");
            return new Iron();
        }
        protected Iron returnIron() {
            System.out.println("正在归还漏斗");
            return new Iron();
        }
        protected Clothes takeClothes() {
            return new Clothes("T 恤");
        }
        protected void iron(Iron iron, Clothes clothes) {
            System.out.println(getName() + "在熨烫 " + clothes.name);
        }
    }

    public static class Iron {
    }

    public static class Clothes {
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    }
}
