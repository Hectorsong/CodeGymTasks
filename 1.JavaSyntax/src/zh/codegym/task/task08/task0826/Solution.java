package zh.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 五名获胜者
创建包含 20 个数字的数组。
从键盘输入数字来填充该数组。
显示五个最大数字。
每行显示一个值。
Requirements:
1. 程序应在屏幕上显示数字。
2. 程序应从键盘读取值。
3. Solution 类必须包含两个方法。
4. sort() 方法应按从高到低的顺序对包含数字的数组进行排序。
5. main() 方法应调用 sort() 方法。
6. 程序应显示数组中的五个最大数字。每行显示一个值。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
//        Arrays.sort(array);
    }
}
