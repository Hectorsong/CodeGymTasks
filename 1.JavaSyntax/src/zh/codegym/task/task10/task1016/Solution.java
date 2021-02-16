package zh.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 列表中的相同词
从键盘读取 20 个单词的列表。
你要计算每个单词出现在列表中的次数。
结果应表示为 Map<String, Integer>，其中键是唯一单词，而且值是该单词出现在列表中的次数。
显示映射的内容。
大小写（大写/小写）会影响结果。
Requirements:
1. countWords 方法必须声明并初始化 HashMap<String, Integer>。
2. countWords 方法必须返回创建的映射。
3. countWords 方法应添加对应于唯一单词的键，以及对应于这些单词出现多少次的值。
4. 程序应显示结果映射。
5. main 方法必须调用 countWords 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            result.put(str , 0);
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            result.put(str , result.get(str).intValue() + 1);
        }


        return result;
    }

}

