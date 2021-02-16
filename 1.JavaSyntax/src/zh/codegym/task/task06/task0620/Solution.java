package zh.codegym.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 纠正年轻人的错误
任务：程序从键盘读取两个数字，并使用诸如“最大值为 25”之类的词组显示最大值。
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应在屏幕上显示结果。
3. 所显示的文本应以"最大值为"开头。
4. 所显示的文本应以两个输入数字中的最大值结尾。
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "最大值为 ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max1 = a > b ? a : b;

        System.out.println(max + max1);
    }

}
