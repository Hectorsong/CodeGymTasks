package zh.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 一个大数组和两个小数组
1.创建包含 20 个数字的数组。
2.从键盘输入值来填充数组。
3.创建两个分别包含 10 个数字的数组。
4.将大数组复制到两个小数组中：一半数字复制到第一个小数组中，另一半数字复制到第二个小数组中。
5.显示第二个小数组，每行显示一个值。
Requirements:
1. 程序必须创建一个包含 20 个整数的数组。
2. 程序应从键盘为大数组读取 20 个数字。
3. 程序必须创建两个分别包含 10 个数字的小数组。
4. 程序必须将大数组中的一半数字复制到第一个小数组中，并将另一半数字复制到第二个数组中，然后在屏幕上显示该数组。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        for (int i = 0 ; i < 20 ; i++){
            list[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0 ; i < 10 ; i++){
            list1[i] = list[i];
            list2[i] = list[i+10];
        }
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(list2[i]);
        }
    }
}
