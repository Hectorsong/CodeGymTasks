package zh.codegym.task.task04.task0429;

/* 正数和负数
使用键盘输入三个整数。显示原始集中正数和负数的个数，格式如下：
“负数个数：a”和“正数个数：b”，其中 a 和 b 是未知的。
下面是一些示例：
a) 如果输入以下数字
2
5
6
则显示
负数个数：0
正数个数：3
b) 如果输入以下数字
-2
-5
6
则显示
负数个数：2
正数个数：1
Requirements:
1. 程序应从键盘读取这些数字。
2. 该程序应在屏幕上显示文本。
3. 程序应显示原始集中负数的个数。
4. 程序应显示原始集中正数的个数。
5. 如果没有负数，程序应显示“负数个数：0”。
6. 如果没有正数，程序应显示“正数个数：0”。
7. 请注意，0 既不是正数也不是负数。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[3];
        int positive_number = 0;
        int negative_number = 0;
        for (int i = 0 ; i < 3 ; i++){
            String str = br1.readLine();
            array1[i] = Integer.parseInt(str);
            if (array1[i] > 0){
                positive_number++;
            }else if (array1[i] < 0){
                negative_number++;
            }
        }
        System.out.println("负数个数：" + negative_number);
        System.out.println("正数个数：" + positive_number);
    }
}
