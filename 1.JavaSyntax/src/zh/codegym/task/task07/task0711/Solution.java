package zh.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 删除和插入
1.创建字符串列表。
2.从键盘添加 5 个字符串。
3.将以下操作执行 13 次：删除最后一个字符串，并将其插入开头位置。
4.使用循环显示生成的列表，每行显示一个值。
Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 程序应从键盘读取 5 个字符串。
3. 删除最后一个字符串，并将其插入开头位置。冲洗掉并重复 13 次。
4. 程序应显示列表，每行显示一个值。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0 ; i < 5 ; i++){
            list.add(bufferedReader.readLine());
        }

        for (int i = 0 ; i < 13 ; i++){
            String temp = list.get(4);
            list.remove(4);
            list.add(0 , temp);
        }

        for (String i: list
             ) {
            System.out.println(i);
        }
    }
}
