package zh.codegym.task.task04.task0442;


/* 相加
使用键盘输入数字。
如果用户输入 -1，则显示所有输入数字的总和并结束程序。
-1 应计入总和中。
提示：解决这个问题的方法之一使用以下结构：
while (true) {
    int number = 读取数字;
    if (检查数字是否是 -1)
        break;
}
Requirements:
1. 程序应从键盘读取这些数字。
2. 如果用户输入 -1，程序应显示所有输入数字的总和并结束运行。
3. 程序必须计算并显示输入数字的总和。
4. 程序必须使用 for 循环或 while 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            String str = br1.readLine();
            int i = Integer.parseInt(str);
            if (i == -1) {
                sum = sum + i;
                break;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
