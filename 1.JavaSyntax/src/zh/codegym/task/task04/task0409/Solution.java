package zh.codegym.task.task04.task0409;

/* 
最接近 10
编写 displayClosestToTen 方法。该方法应显示最接近 10 的参数。
例如，给定数字 8 和 11，则 11 最接近十。如果两个数字同样接近 10，则显示其中任一数字。
提示：
使用 public static int abs(int a) 方法，该方法返回数字的绝对值。
Requirements:
1. 该程序应在屏幕上显示文本。
2. main 方法不应调用 System.out.println 或 System.out.print()。
3. main 方法应调用 displayClosestToTen 方法。
4. displayClosestToTen 方法应调用 abs 方法。
5. displayClosestToTen 方法应根据任务条件在屏幕上显示数字。
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // 在此编写你的代码
        if (abs(a-10) <= abs(b-10)){
            System.out.println(a);
        }else
            System.out.println(b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}