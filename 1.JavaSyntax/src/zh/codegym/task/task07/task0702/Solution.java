package zh.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 以相反顺序显示字符串数组
1.创建包含 10 个字符串的数组。
2.从键盘输入 8 个字符串并将其保存在数组中。
3.在屏幕上以相反顺序显示整个数组（10 个元素）的内容。每行显示一个元素。
Requirements:
1. 程序必须创建包含 10 个字符串的数组。
2. 程序应从键盘为数组读取 8 个字符串。
3. 程序应显示 10 字符串，每行显示一个。
4. 字符串数组（10 个元素）必须以相反顺序显示。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0 ; i < 8 ; i++){
            list[i] = bufferedReader.readLine();
        }
        for (int j = 9 ; j >= 0 ; j--){
            System.out.println(list[j]);
        }


    }
}