package zh.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 以相反顺序显示词语
从键盘读取 5 个词语，然后将其添加到字符串列表中。删除列表中的第 3 个项目，然后以相反顺序显示其余项目。
Requirements:
1. 声明 ArrayList<String> 变量并立即初始化该变量。
2. 从键盘读取 5 行内容并将其添加到列表中。
3. 删除列表中的第三个元素。
4. 在屏幕上显示项目，每行显示一个。
5. 显示顺序必须相反
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++){
            list.add(bufferedReader.readLine());
        }
        list.remove(2);
/*        for (String str: list
             ) {
            System.out.println(str);
        }*/
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}


