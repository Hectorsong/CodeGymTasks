package zh.codegym.task.task04.task0402;

/* 
苹果的价格
*/
public class Solution {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("苹果的价格为 " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            //在此编写你的代码
            /*静态存储（含static）：调用对象时，需要将对象之前的类名加上（如题目的Apple.applePrice）。
            非静态存储（不含static）：调用对象时，需要在对象之前加一个this（如题目中this.age）*/
            /*文章叙述中，实例变量 =成员变量，(具体原因可以搜有“例外”的那行和下面的例子)。
            两个练习题属于局部变量(最接近的代码段里的变量)和实例变量名称相同，情况都是文中的“局部变量遮罩了实例变量”。
            age那题是非static，用this.实例变量名，苹果这题是static，类名.实例变量名。
            ******总结：前提条件 局部变量和实例变量相同，再判断是static还是非static，用相应的调用方法即可。
            * */
            Apple.applePrice = Apple.applePrice + applePrice;
        }
    }
}
