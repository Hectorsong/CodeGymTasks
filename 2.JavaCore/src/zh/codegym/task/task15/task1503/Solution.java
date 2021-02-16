package zh.codegym.task.task15.task1503;

/* 
OOP：汽车
*/

public class Solution {

    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    protected static class LuxuryCar extends Constants{
        protected void printlnDesire() {
            System.out.println(WANT_STRING + LUXURY_CAR);
        }
    }

    protected static class CheapCar extends Constants{
        protected void printlnDesire() {
            System.out.println(WANT_STRING + CHEAP_CAR);
        }
    }

    public static class Ferrari extends LuxuryCar{
        public void printlnDesire() {
            System.out.println(WANT_STRING + FERRARI_NAME);
        }
    }

    public static class GeoMetro extends CheapCar{
        public void printlnDesire() {
            System.out.println(WANT_STRING + GEO_METRO_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "我想开";
        public static String LUXURY_CAR = "豪车";
        public static String CHEAP_CAR = "便宜车";
        public static String FERRARI_NAME = "法拉利";
        public static String GEO_METRO_NAME = "雪弗兰";
    }
}
