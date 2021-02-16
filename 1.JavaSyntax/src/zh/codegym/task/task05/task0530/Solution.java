package zh.codegym.task.task05.task0530;

import java.io.*;

/* 老板，发生了一件奇怪的事情
任务：程序从键盘读取两个数字，并在屏幕上显示它们的总和。
Requirements:
1. 程序应从键盘读取这些数字。
2. 该类只能包含一个 main 方法。
3. 程序应显示以“总和 =”开头的字符串。
4. 程序应显示以所输入数字之和结尾的字符串。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("总和 = " + sum);
    }
}
