package zh.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 最短或最长
1.创建字符串列表。
2.从键盘添加 10 个字符串。
3.找出列表中较早出现的字符串：最短的或最长的。
如果有多个字符串为最短或最长的字符串，则考虑遇到的第一个此类字符串。
4.显示第 3 步中描述的字符串。应显示一个字符串。
Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 程序应从键盘读取 10 个字符串并将其添加到列表中。
3. 如果最短字符串在最长字符串之前出现，则程序应显示最短字符串。
4. 如果最长字符串在最短字符串之前出现，则程序应显示最长字符串。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        int maxSize = 0;
        int maxIndex = 0;
        int minSize = 0;
        int minIndex = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0 ; i < 10 ; i++){
            list.add(bufferedReader.readLine());
            //获取最短字符串Index
            if (i == 0) {
                minSize = list.get(i).length();
            }else if (minSize > list.get(i).length()){
                minSize = list.get(i).length();
                minIndex = i;
            }
            //获取最长字符串Index
            if (maxSize < list.get(i).length()){
                maxSize = list.get(i).length();
                maxIndex = i;
            }
        }

        System.out.println(maxIndex <= minIndex ? list.get(maxIndex) : list.get(minIndex));;
    }
}
