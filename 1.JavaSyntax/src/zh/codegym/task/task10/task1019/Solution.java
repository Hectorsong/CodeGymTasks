package zh.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 功能还不够！
任务：程序从键盘读取一对（一个数字和字符串）并在屏幕上显示。
新任务：程序从键盘读取对（一个数字和字符串），并将其存储在 HashMap。
任何空的输入字符都表示数据输入结束。
这些数字可以重复。
字符串始终是唯一的。
输入的数据不得丢失！
然后该程序在屏幕上显示 HashMap 的内容。
每个新行显示一对。
示例输入：
1
张三
2
我
1
是
示例输出：
1 张三
2 我
1 是
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应在屏幕上显示文本。
3. 在 main 方法中，声明 HashMap 变量并立即初始化该变量。
4. 程序应将从键盘读取的对填充到 HashMap 中。
5. 程序应根据条件显示 HashMap 的内容。键和值之间用空格分隔。每行显示一个值。
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String , Integer> hashMap = new HashMap<>();

        try {
            int id = 0;
            String name = null;
            while (true){
                String idStr = reader.readLine();
                if (idStr.length() == 0){
                    break;
                }
                id = Integer.parseInt(idStr);
                name = reader.readLine();
/*                if (name.length() == 0){
                    break;
                }*/
                hashMap.put(name, id);

            }
            for (Map.Entry<String , Integer> entry : hashMap.entrySet()
                 ) {
                System.out.println(entry.getValue() + " " + entry.getKey());
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
