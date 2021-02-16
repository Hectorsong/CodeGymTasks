package zh.codegym.task.task15.task1506;

/* 
多余的内容
*/

public class Solution {

    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("这是一个 Integer");
    }

    public static void print(Object i) {
        System.out.println("这是一个 Object");
    }

    public static void print(double i) {
        System.out.println("这是一个 double");
    }

}
