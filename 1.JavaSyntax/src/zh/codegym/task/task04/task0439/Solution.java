package zh.codegym.task.task04.task0439;

/* 连锁信
从键盘输入一个名字，并使用 for 循环显示以下短语 10 次：<名字>爱我。

名字“斯嘉丽”的示例输出：
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。
斯嘉丽爱我。


Requirements:
1. 程序应从键盘读取名字。
2. 该程序应在屏幕上显示文本。
3. 程序应将任务中指定的文本显示 10 次。
4. 程序必须使用 for 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();
        for (int i = 0; i < 10; i++){
            System.out.println(str + "爱我。");
        }

    }
}
