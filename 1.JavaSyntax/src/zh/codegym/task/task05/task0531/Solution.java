package zh.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 改进功能
当前实现：程序从键盘读取两个数字并显示最小值。
新任务：程序从键盘读取五个数字并显示最小值。
Requirements:
1. 程序应从键盘读取这些数字。
2. 该类必须包含 public static void main 方法。
3. 该类必须包含带 5 个参数的 public static min 方法。
4. min 方法必须返回所传递的 5 个数字中的最小值。如果有多个最小数字，则返回其中任意一个。
5. 程序应显示以“最小值 = ”开头的字符串。
6. 程序应显示以五个输入数字中的最小值结尾的字符串。
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[5];
        for (int i = 0 ; i < 5 ; i++){
            String str = reader.readLine();
            array1[i] = Integer.parseInt(str);
        }
        int minimum = min(array1[0], array1[1], array1[2], array1[3], array1[4]);
        System.out.println("最小值 = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e){
        return min(e, min(d, min(c, min(a, b))));
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
