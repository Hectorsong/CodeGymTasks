package zh.codegym.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 那是什么类型的列表？
1.创建字符串列表。
2.向列表中添加 5 个不同的字符串。
3.在屏幕上显示列表大小。
4.使用循环显示列表内容，每行显示一个值。
注意：
仅在初始化列表后，再将字符串添加到列表中。
Requirements:
1. 程序不得从键盘读取任何内容。
2. 声明 ArrayList<String> 变量并立即初始化该变量。
3. 程序应向列表中添加任意 5 个字符串。
4. 程序应在屏幕上显示列表大小。
5. 程序应显示列表内容，每行显示一个值。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0 ; i < 5 ; i++){
//            String str = bufferedReader.readLine();
            String str = "Hello World!";
            list.add(str);
        }
        System.out.println(list.size());
        for (int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
