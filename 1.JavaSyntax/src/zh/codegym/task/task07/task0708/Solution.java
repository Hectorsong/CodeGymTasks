package zh.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* 最长的字符串
1.初始化字符串列表。
2.从键盘读取 5 个字符串，并将其添加到此列表中。
3.使用循环找出列表中最长的字符串。
4.显示字符串。如果有多个最长字符串，则每行显示一个。

Requirements:
1. 在 main 方法中，将 Solution 类的现有字符串字段初始化为新的 ArrayList<>。
2. 程序应从键盘读取 5 个字符串，并将其写入字符串列表中。
3. 程序应显示最长的字符串。
4. 如果有多个最长字符串，则需要每行显示一个。
*/

public class Solution {
    private static List<String> strings;
//    private static int size = 0;//使用静态的size为什么不可以？

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        ArrayList<String> maxList = new ArrayList<>();
        int size = 0;
        for (int i = 0 ; i < 5 ; i++){
            strings.add(bufferedReader.readLine());
            if(size < strings.get(i).length()){
                size = strings.get(i).length();
                maxList.clear();
                maxList.add(0,strings.get(i));
            }else if (size == strings.get(i).length()){
                maxList.add(strings.get(i));
            }
        }
        Iterator<String> iterator = maxList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
