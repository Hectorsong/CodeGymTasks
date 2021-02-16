package zh.codegym.task.task04.task0426;

/* 标签和数字
使用键盘输入一个整数。按如下所示显示字符串描述：
“负偶数”- 如果数字同时为负数和偶数，
“负奇数”- 如果数字同时为负数和奇数，
“零”- 如果数字为 0，
“正偶数”- 如果数字同时为正数和偶数，
“正奇数”- 如果数字同时为正数和奇数。
例如，对于 100：
正偶数
例如，对于 -51：
负奇数
Requirements:
1. 程序应从键盘读取数字。
2. 程序应使用 System.out.println() 或 System.out.print()。
3. 如果数字同时为负数和偶数，则显示“负偶数”。
4. 如果数字同时为负数和奇数，则显示“负奇数”。
5. 如果数字为 0，则显示“零”。
6. 如果数字同时为正数和偶数，则显示“正偶数”。
7. 如果数字同时为正数和奇数，则显示“正奇数”。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] arry1 = new int[1];
        for (int i = 0 ; i < 1 ; i++){
            String str = br1.readLine();
            arry1[i] = Integer.parseInt(str);
        }
        if (arry1[0] > 0){
            if (arry1[0] % 2 == 0){
                System.out.println("正偶数");
            }else System.out.println("正奇数");
        }else if (arry1[0] < 0){
            if (arry1[0] % 2 == 0) {
                System.out.println("负偶数");
            }else System.out.println("负奇数");
        }else if (arry1[0] == 0){
            System.out.println("零");
        }

    }
}
