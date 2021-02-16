package zh.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 到达列表顶部
1.在 main 方法中创建字符串列表。
2.从键盘向该列表中添加 10 个字符串，但只将其添加到列表开头而非末尾。
3.使用循环显示内容，每行显示一个值。

Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 程序应从键盘读取 10 个字符串并将其添加到列表中。
3. 程序应向列表开头添加几行内容。
4. 程序应显示列表，每行显示一个值。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0 ; i < 10 ; i++){
            list.add(0,bufferedReader.readLine());
        }
        for(String i: list){
            System.out.println(i);
        }
    }
}
