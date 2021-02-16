package zh.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 更改功能
任务：程序读取字符串，直至用户输入空字符串（通过按 Enter 键）为止。然后将字符串转换为大写字母（“mother”变成“MOTHER”）并显示它们。
新任务：程序读取字符串，直至用户输入空字符串（通过按 Enter 键）为止。
然后，程序将构建一个新列表。如果字符串的字母数为偶数，则复制该字符串。如果字母数为奇数，则该字符串被重复三次。
程序显示新列表的内容。
示例输入：
Cat
Cats
I
示例输出：
Cat Cat Cat
Cats Cats
I I I
Requirements:
1. 程序必须从键盘读取数据。
2. 程序所显示的字符串应与输入的字符串一样多。
3. 如果字符串的字母数为偶数，则需要复制该字符串（如示例中所示）
4. 如果字符串的字母数为奇数，则需要重复该字符串三次（如示例中所示）
5. 只要用户输入空字符串（通过按 Enter 键），程序应停止从键盘读取数据。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
//            if ("".equals(s)) break;
            list.add(s);
        }

        ArrayList<String> copyList = new ArrayList<String>();
        for (int i = 0; i < list.size() ; i++) {
            String s = list.get(i);
            char[] charArray = s.toLowerCase().toCharArray();
            if (charArray.length % 2 == 0){
                copyList.add(s + " " + s);
            }else {
                copyList.add(s + " " + s + " " + s);
            }

        }

        for (int i = 0; i < copyList.size(); i++) {
            System.out.println(copyList.get(i));
        }
    }
}
