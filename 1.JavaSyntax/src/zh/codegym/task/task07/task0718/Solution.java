package zh.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 检查顺序
1.从键盘读取 10 个单词并将其添加到字符串列表中。
2.确定列表是否按字符串长度升序排序。
3.如果不是，则显示打乱此顺序的第一个元素的索引。
Requirements:
1. 声明字符串列表变量并立即初始化该变量。
2. 从键盘读取 10 行内容并将其添加到列表中。
3. 如果列表是按字符串长度升序排序的，则无需显示任何内容。
4. 如果列表不是按字符串长度升序排序的，则显示第一个打乱此顺序的元素的索引。
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(bufferedReader.readLine());
        }
        int index = returnListIndex(list);
        if (index != -1){
            System.out.println(index);
        }
    }

    public static int returnListIndex(ArrayList<String> list){
        for (int i = 1; i < list.size(); i++){
            if (list.get(i-1).length() > list.get(i).length()){
                return i;
            }
        }
        return -1;
    }
}

