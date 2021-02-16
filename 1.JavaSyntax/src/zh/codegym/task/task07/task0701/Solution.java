package zh.codegym.task.task07.task0701;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
数组中的最大值
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // 创建并填充数组
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int listNumber = 20;
        int[] list = new int[20];
        for (int i = 0 ; i < 20 ; i++){
            list[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        // 找出最大值
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
