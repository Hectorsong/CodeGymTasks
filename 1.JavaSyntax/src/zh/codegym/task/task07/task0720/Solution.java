package zh.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 及时洗牌
使用键盘输入 2 个数字 N 和 M。
输入 N 个字符串并将其放入列表中。
将前 M 个字符串移到列表末尾。
显示列表，每行显示一个值。
注意：
不能创建多个列表。
Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 从键盘读取数字 N 和 M。读取 N 个字符串并将其添加到列表中。
3. 将前 M 个字符串移到列表末尾。
4. 显示列表，每行显示一个值。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numN = Integer.parseInt(reader.readLine());
        int numM = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < numN ; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i < numM ; i++){
            String str = list.get(i);
            list.add(str);
        }
        for (int i = 0; i < numM ; i++){
            list.remove(0);
        }

        for (String str: list
             ) {
            System.out.println(str);
        }
    }
}
