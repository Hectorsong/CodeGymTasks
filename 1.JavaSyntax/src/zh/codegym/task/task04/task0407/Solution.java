package zh.codegym.task.task04.task0407;

/* 
宇宙中的猫
*/
/*
* 宇宙中的猫
编写代码以正确对所创建的猫的数量进行计数 (count)，并在屏幕上显示猫的正确数量。
Requirements:
1. 该程序应在屏幕上显示文本。
2. 不要更改负责屏幕输出的行。
3. Cat 类只能包含一个 count 变量。
4. Cat 类的变量 count 必须为 static int、包含一个 public 访问修饰符，并且被初始化为零。
5. main 方法只能有两个已被初始化的 Cat 变量。
6. 变量 count 必须存储已创建的 cat 对象的实际数量。
* */
public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //在此编写你的代码
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("猫的计数为 " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}