package zh.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 数组中的最小值和最大值
创建包含 20 个数字的数组。
从键盘输入数字来填充该数组。
找出数组中的最大和最小数字。
显示最大数字和最小数字，用空格分隔。
Requirements:
1. 创建包含 20 个元素的 integers (int[]) 数组。
2. 从键盘读取 20 个整数并将其添加到数组中。
3. 找出最大和最小的整数，然后显示它们，用空格分隔。
4. 使用 for 循环。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20 ; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum;
        int minimum;
        int a = array.length;
        Arrays.sort(array);
        maximum = array[19];
        minimum = array[0];
        System.out.print(maximum + " " + minimum);
    }
}
