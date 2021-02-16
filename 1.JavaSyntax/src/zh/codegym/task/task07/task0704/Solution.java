package zh.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 翻转数组
1.创建包含 10 个数字的数组。
2.从键盘输入 10 个数字并将其写入数组中。
3.以相反顺序显示数组的元素。每行显示一个值。
Requirements:
1. 程序必须创建包含 10 个整数的数组。
2. 程序应从键盘为数组读取数字。
3. 程序应显示 10 个值，每行显示一个。
4. 数组必须以相反顺序显示。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            list[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 9 ; i >= 0 ; i--){
            System.out.println(list[i]);
        }
    }
}

