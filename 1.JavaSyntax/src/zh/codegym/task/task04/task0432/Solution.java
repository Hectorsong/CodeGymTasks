package zh.codegym.task.task04.task0432;



/* 好东西也不能索取无度
使用键盘输入字符串和大于 0 的数字 N。
使用 while 循环将字符串显示 N 次。每行显示一个值。
示例输入：
abc
2
示例输出：
abc
abc
Requirements:
1. 程序应从键盘读取文本。
2. 该程序应在屏幕上显示文本。
3. 每行显示一个值。
4. 程序应将字符串显示 N 次。
5. 程序必须使用 while 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[2];
        for (int i = 0; i < 2; i++){
            array1[i] = br1.readLine();
        }
        int num = Integer.parseInt(array1[1]);
        while (num > 0){
            System.out.println(array1[0]);
            num--;
        }
    }
}
