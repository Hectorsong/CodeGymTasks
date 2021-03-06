package zh.codegym.task.task04.task0434;


/* 乘法表
使用 while 循环显示 10x10 乘法表。
使用空格将数字分隔。
示例输出：
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100
Requirements:
1. 程序不得从键盘读取文本。
2. 该程序应在屏幕上显示文本。
3. 程序应显示 10x10 乘法表。
4. 程序必须使用 while 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        int i = 1;
        while (i <= 10){
            int j = 1;
            while (j <= 10){
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
