package zh.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 复制单词
1.从键盘读取 10 个单词并将其添加到字符串列表中。
2.doubleValues 方法应复制单词，如下所示：
alpha、beta、gamma -> alpha、alpha、beta、beta、gamma、gamma。
3.显示结果，每行显示一个值。

Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 从键盘读取 10 行内容并将其添加到列表中。
3. doubleValues 方法应复制列表元素，如下所示：alpha、beta、gamma -> alpha、alpha、beta、beta、gamma、gamma。
4. 显示生成的列表，每行显示一个元素。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // 从控制台读取字符串并在此声明 ArrayList
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(bufferedReader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // 显示结果
        for (String str : result
             ) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //在此编写你的代码
        int size = list.size() * 2;
        for (int i = 0; i < size;i+=2) {
            String str = list.get(i);
            list.add(i, str);
        }
        return list;
    }
}
