package zh.codegym.task.task04.task0443;


/* 名字就是名字
使用键盘输入名字。
使用键盘输入出生日期（三个数字）：年、月、日。

显示以下内容：
“我的名字叫*名字*。
我出生于月/日/年”
示例输出：
我的名字叫凯文。
我出生于 2/15/1988
Requirements:
1. 程序应从键盘读取 4 行内容。
2. 程序应在屏幕上显示几行内容。
3. 程序应根据任务中指定的模板显示文本。
4. 每行显示一个语句。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[4];
        for (int i = 0 ; i < 4 ; i++){
            array1[i] = br1.readLine();

        }
        System.out.println("我的名字叫" + array1[0] + "。");
        System.out.println("我出生于 " + array1[2] + "/" + array1[3] + "/" + array1[1]);
    }
}
