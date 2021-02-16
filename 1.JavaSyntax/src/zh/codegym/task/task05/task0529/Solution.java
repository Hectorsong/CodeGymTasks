package zh.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 基于控制台的存钱罐
使用键盘输入数字并计算总和，直至用户输入词语“总和”为止。
在屏幕上显示计算得出的总和。

提示：要从键盘读取数字，直至输入字符串“退出”为止，请执行以下命令：
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("退出"))
		break;
}
Requirements:
1. 程序必须从键盘读取数据。
2. 用户输入词语“总和”并按 Enter 键之后，程序应停止从键盘读取数据。
3. 如果用户输入一个数字和词语“总和”，程序应正常运行。
4. 如果用户输入两个数字和词语“总和”，程序应正常运行。
5. 如果用户输入两个以上的数字和词语“总和”，程序应正常运行。
6. 程序应在屏幕上显示文本。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("总和"))
                break;
            sum = sum + Double.parseDouble(s);
        }
        System.out.println(sum);
    }
}
