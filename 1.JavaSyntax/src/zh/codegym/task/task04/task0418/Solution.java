package zh.codegym.task.task04.task0418;

/* 两个数字中的最小值
使用键盘输入两个整数，然后显示最小值。如果这两个数字相等，则显示其中任一数字。
Requirements:
1. 程序应从键盘读取这些数字。
2. 程序必须在屏幕上显示一个数字。
3. 程序应显示两个整数中的最小值。
4. 如果这两个数字相等，则显示其中任一数字。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br1.readLine();
        int i = Integer.parseInt(str1);
        String str2 = br1.readLine();
        int j = Integer.parseInt(str2);
        if ( i <= j ){
            System.out.println(i);
        }else System.out.println(j);
    }
}