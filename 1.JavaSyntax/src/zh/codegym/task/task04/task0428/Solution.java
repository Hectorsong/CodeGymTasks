package zh.codegym.task.task04.task0428;

/* 正数
使用键盘输入三个整数。显示原始集中正数的个数。
下面是一些示例：
a) 如果输入以下数字
-4
6
6
则显示
2
b) 如果输入以下数字
-6
-6
-3
则显示
0
c) 如果输入以下数字
0
1
2
则显示
2
Requirements:
1. 程序应从键盘读取这些数字。
2. 程序必须在屏幕上显示一个数字。
3. 程序应显示原始集中正数的个数。
4. 如果没有正数，程序应显示“0”。
5. 请注意，0 既不是正数也不是负数。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[3];
        int count = 0;
        for (int i = 0 ; i < 3 ; i++){
            String str = br1.readLine();
            array1[i] = Integer.parseInt(str);
            if (array1[i] > 0) count++;
        }
        System.out.println(count);

    }
}
