package zh.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 元音和辅音
编写从键盘读取字符串的程序。
该程序应显示两行：
1.第一行仅包含输入字符串中的元音。
2.第二行仅包含输入字符串中的辅音和标点符号。
字母应以空格分隔，每行必须以空格结尾。
示例输入：
Sam I Am.
示例输出：
a I A
S m m .
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应显示两行。
3. 第一行应仅包含输入字符串中的元音，并以空格分隔。
4. 第二行应仅包含输入字符串中的辅音和标点符号，并以空格分隔。
5. 每一行末尾都要加一个空格。
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        str = str.replace(" ", "");
        ArrayList<Character> arrayList1 = new ArrayList<Character>();
        ArrayList<Character> arrayList2 = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (isVowel(temp)){
                arrayList1.add(temp);
            }else
                arrayList2.add(temp);
        }
        for (Character char1: arrayList1
             ) {
            System.out.print(char1 + " ");
        }
        System.out.println();
        for (Character char1: arrayList2
        ) {
            System.out.print(char1 + " ");
        }
    }

    // 该方法检查字母是否为元音
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // 转换为小写

        for (char d : vowels)   // 在数组中查找元音
        {
            if (c == d)
                return true;
        }
        return false;
    }
}