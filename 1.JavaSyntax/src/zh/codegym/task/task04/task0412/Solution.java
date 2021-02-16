package zh.codegym.task.task04.task0412;

/* 正数和负数
使用键盘输入一个数字。
如果该数字为正数，则将其加倍。
如果该数字为负数，则将其加一。
如果输入的数字为零，则显示零。
在屏幕上显示结果。
Requirements:
1. 程序应从键盘读取数字。
2. 程序必须在屏幕上显示一个数字。
3. 如果输入的数字为正数，则将其加倍并显示结果。
4. 如果输入的数字为负数，则将其加一并显示结果。
5. 如果输入的数字为零，则显示零。
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0){
            System.out.println(a + 1);
        }else if (a > 0){
            System.out.println(a * 2);
        }else
            System.out.println(a);

    }

}