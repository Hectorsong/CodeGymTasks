package zh.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 更简洁地表达自己
1.创建字符串列表。
2.从键盘读取 5 个字符串并将其添加到列表中。
3.使用循环找出列表中最短的字符串。
4.显示字符串。
5.如果有多个最长字符串，则每行显示一个。

Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 程序应从键盘读取 5 个字符串并将其写入列表中。
3. 程序应显示最短的字符串。
4. 如果有多个最短字符串，则需要每行显示一个。
*/

public class Solution {
    private static List<String> strings;
//    private static int size = 0;//使用静态的size为什么不可以？

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        ArrayList<String> minList = new ArrayList<>();
        int size = 0;
        for (int i = 0 ; i < 5 ; i++){
            strings.add(bufferedReader.readLine());
            if (i == 0) size = strings.get(i).length();
            if(size > strings.get(i).length()){
                size = strings.get(i).length();
                minList.clear();
                minList.add(0,strings.get(i));
            }else if (size == strings.get(i).length()){
                minList.add(strings.get(i));
            }
        }
        Iterator<String> iterator = minList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
