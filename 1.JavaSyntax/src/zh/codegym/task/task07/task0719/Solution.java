package zh.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 以相反顺序显示数字
从键盘输入 10 个数字并将其放入列表中。
以相反顺序显示它们。每行显示一个元素。
只使用 for 循环。
Requirements:
1. 声明一个整数列表变量并立即初始化该变量。
2. 从键盘读取 10 个整数并将其添加到列表中。
3. 以相反顺序显示这些数字。
4. 使用 for 循环。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}
