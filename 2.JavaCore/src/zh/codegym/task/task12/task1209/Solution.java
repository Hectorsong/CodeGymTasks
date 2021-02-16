package zh.codegym.task.task12.task1209;

/* 三种方法和最小值
编写以下 public static 方法：int min(int, int)、long min(long, long)、double min(double, double)。
每个方法必须返回传递给它的两个数字中的最小值。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. Solution 类必须包含四个方法。
3. Solution 类必须包含 static int min(int, int) 方法。
4. int min(int, int) 方法必须返回两个 int 数字中的最小值。
5. Solution 类必须包含 static long min(long, long) 方法。
6. long min(long, long) 方法必须返回两个 long 数字中的最小值。
7. Solution 类必须包含 static double min(double, double) 方法。
8. double min(double, double) 方法必须返回两个 double 数字中的最小值。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int number1, int number2){
        return number1 < number2 ? number1 : number2;
    }

    public static long min(long number1, long number2){
        return number1 < number2 ? number1 : number2;
    }

    public static double min(double number1, double number2){
        return number1 < number2 ? number1 : number2;
    }
}
