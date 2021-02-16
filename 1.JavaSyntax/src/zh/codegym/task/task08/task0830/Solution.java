package zh.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 有关算法的任务
任务：从键盘输入 20 个单词（仅使用拉丁字母），并以字母顺序显示它们。每行显示一个单词。
Requirements:
1. 程序应在屏幕上显示文本。
2. 程序应从键盘读取值。
3. Solution 类必须包含三个方法。
4. main() 方法应调用 sort() 方法。
5. sort() 方法应调用 isGreaterThan() 方法。
6. 所显示的单词应按字母顺序排序。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isGreaterThan(array[j], array[j+1])){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
