package zh.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 寂寞数组之间的互动
1.创建包含 10 个字符串的数组。
2.创建包含 10 个数字的数组。
3.从键盘输入 10 个字符串，然后将其放入字符串数组中。
4.在数字数组的每个元素中，记录其字符串数组索引与数字数组当前索引一致的字符串的长度。

显示数字数组的内容，每行显示一个值。

Requirements:
1. 程序必须创建包含 10 个字符串的数组。
2. 程序必须创建包含 10 个整数的数组。
3. 程序应从键盘为数组读取字符串。
4. 程序必须在数字数组中记录字符串的长度，然后在屏幕上显示它们。*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] list1 = new String[10];
        int[] list2 = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            list1[i] = bufferedReader.readLine();
            list2[i] = list1[i].length();
        }
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(list2[i]);
        }
    }
}
