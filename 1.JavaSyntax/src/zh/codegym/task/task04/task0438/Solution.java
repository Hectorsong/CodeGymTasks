package zh.codegym.task.task04.task0438;

/* 画线
使用 for 循环显示：
- 由 10 个 8 组成的水平线
- 由 10 个 8 组成的垂直线（在此垂直线中，不将水平线上的任何一个 8 计算在内）。

Requirements:
1. 程序不得从键盘读取数字。
2. 程序应在屏幕上显示数字。
3. 程序应显示由 10 个 8 组成的水平线
4. 程序应显示由 10 个 8 组成的垂直线
5. 程序必须使用 for 循环。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        for (int i = 0 ; i < 10 ; i++){
            System.out.print("8");
        }
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("8");
        }

    }
}
