package zh.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 又见“我是山姆”
1.创建词语列表：“山姆”、“我”、“是”。
2.在每个词语之后，向列表中插入词语“火腿”。
3.在屏幕上显示结果，每行显示一个列表元素。
Requirements:
1. 程序不得从键盘读取数据。
2. 声明字符串列表变量并立即初始化该变量。
3. 向列表中添加以下词语：“山姆”、“我”、“是”。
4. 在每个词语之后，向列表中添加字符串“火腿”。
5. 在屏幕上显示列表项目，每行显示一个。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("山姆");
        list1.add("我");
        list1.add("是");
        for (int i = 1; i <= list1.size(); i = i + 2){
            list1.add(i , "火腿");
//            list1.set(i , list1.get(i) + "火腿");
        }
        for (String str : list1
             ) {
            System.out.println(str);
        }
    }
}
