package zh.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;

/* 月份编号
程序从键盘读取月份名称，然后在屏幕上使用如下短语显示月份编号：“May 是第 5 个月”。
使用集合。
Requirements:
1. 程序应从键盘读取一个值。
2. 程序应在屏幕上显示文本。
3. 程序必须使用集合。
4. 程序应从键盘读取月份的名称，并根据指定模板在屏幕上显示月份编号。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");
        arrayList.add("June");
        arrayList.add("July");
        arrayList.add("August");
        arrayList.add("September");
        arrayList.add("October");
        arrayList.add("November");
        arrayList.add("December");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if (temp.equals(str)){
                System.out.println(temp + " 是第 " + (arrayList.indexOf(temp)+1) + " 个月");
            }
        }
    }
}
