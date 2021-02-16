package zh.codegym.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 有关算法的任务
编写程序，使其：
1. 从控制台读取数字 N（必须大于 0）
2. 从控制台读取 N 个数字
3.显示 N 个输入数字中的最大值。
Requirements:
1. 程序应从键盘读取这些数字。
2. 程序必须在屏幕上显示一个数字。
3. 该类必须包含 public static void main 方法。
4. 不要向 Solution 类添加新方法。
5. 程序应显示 N 个输入数字中的最大值。
6. 如果 N 小于或等于 0，程序不应显示任何内容。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int num = Integer.parseInt(reader.readLine());
        if (num > 0){
            int[] array1 = new int[num];
            for (int i = 0 ; i < num ; i++){
                array1[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.sort(array1);
            maximum = array1[num - 1];
            System.out.println(maximum);
        }else if (num <= 0 ){
            System.out.println();
        }


    }
}
