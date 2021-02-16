package zh.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 结束
创建字符串列表。
从键盘输入字符串并将其添加到列表中。
从键盘输入字符串，直至用户输入“结束”为止。忽略字符串“结束”。
在屏幕上显示字符串，每行显示一个。
Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 从键盘读取字符串并将其添加到列表中，直至用户输入“结束”为止。
3. 不要将“结束”添加到列表中。
4. 显示列表，每行显示一个值。
5. 使用 for 循环。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String str = null;
        while (!"结束".equals(str)){
            str = reader.readLine();
            list.add(str);
        }
        list.remove(list.size()-1);
        for (String s : list
             ) {
            System.out.println(s);
        }
    }
}