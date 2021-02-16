package zh.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 有关算法的任务
任务：用户从键盘输入单词（和数字）列表。单词按升序显示，数字按降序显示。
示例输入：
Cherry
1
Bob
3
Apple
22
0
Watermelon
示例输出：
Apple
22
Bob
3
Cherry
1
0
Watermelon
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应在屏幕上显示数据。
3. 显示的单词应按升序排列（使用提供的 isGreaterThan 方法）。
4. 显示的数字必须按降序排列。
5. main 方法应使用 sort 方法。
6. sort() 方法应调用 isGreaterThan() 方法。
7. sort() 方法应调用 isNumber() 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            if (isNumber(temp)){
                arrayList1.add(Integer.parseInt(temp));
            }else arrayList2.add(temp);
        }

        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList1.size() - i - 1; j++) {
                Integer temp1 = arrayList1.get(j);
                Integer temp2 = arrayList1.get(j+1);
                if (temp1 < temp2){
                    Integer temp = temp1;
                    arrayList1.set(j , temp2);
                    arrayList1.set(j+1 , temp);
                }
            }
        }

        for (int i = 0; i < arrayList2.size(); i++) {
            for (int j = 0; j < arrayList2.size() - i - 1; j++) {
                String temp1 = arrayList2.get(j);
                String temp2 = arrayList2.get(j+1);
                if (isGreaterThan(temp1, temp2)){
                    String temp = temp1;
                    arrayList2.set(j , temp2);
                    arrayList2.set(j+1 , temp);
                }
            }
        }
        int arrayList1Index = 0;
        int arrayList2Index = 0;
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            if (isNumber(temp)){
                array[i] = String.valueOf(arrayList1.get(arrayList1Index));
                arrayList1Index++;
            }else {
                array[i] = arrayList2.get(arrayList2Index);
                arrayList2Index++;
            }}

    }
    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // 传递的字符串是数字吗？
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // 字符串包含连字符
                    || (!Character.isDigit(c) && c != '-') // 或不是数字并且不以连字符开头
                    || (i == 0 && c == '-' && chars.length == 1)) // 或为单个连字符
            {
                return false;
            }
        }
        return true;
    }
}
