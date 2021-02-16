package zh.codegym.task.task04.task0430;

/* 1 到 10
使用 while 循环从 1 到 10 显示数字。每行显示一个值。
Requirements:
1. 程序不得从键盘读取数字。
2. 程序应在屏幕上显示数字。
3. 每行显示一个值。
4. 程序应从 1 到 10 显示数字。
5. 程序必须使用 while 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }
}