package zh.codegym.task.task05.task0507;

/* 算术平均值
使用键盘输入数字，然后计算算术平均值。
如果用户输入 -1，则显示所有输入数字的算术平均值并结束程序。
-1 不应包含在计算中。
下面是一些示例：
a) 如果输入以下数字
1
2
2
4
5
-1
则显示
2.8
b) 如果输入以下数字
4
3
2
1
-1
则显示
2.5
提示：解决这个问题的方法之一使用以下结构：
while (true) {
    int number = 读取数字;
    if (检查数字是否是 -1)
        break;
}
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应在屏幕上显示数据。
3. 输入 -1 后，程序必须正确地终止。
4. 如果依次输入数字 1、2、2、4、5 和 -1，程序应显示 2.8。
5. 如果依次输入数字 -100、0、100 和 -1，程序应显示 0.0。
6. 如果依次输入数字 1 和 -1，程序应显示 1.0。
7. 对于任意输入数据，所显示的结果应与任务条件相匹配。
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double sum = 0;
        while (true) {
            String str = br1.readLine();
            int number = Integer.parseInt(str);
            if (number == -1)
                break;
            sum = sum + number;
            i++;
        }
        System.out.println(sum / i / 1.0);
    }
}

