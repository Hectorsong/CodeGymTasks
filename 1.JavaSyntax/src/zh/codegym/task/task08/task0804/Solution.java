package zh.codegym.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;

/* 显示键的列表
有一个 HashMap<String, String>。已向其中添加了 10 个不同的字符串。 
在屏幕上显示键的列表，每行显示一个元素。
Requirements:
1. 程序必须创建包含 (String, String) 元素的 HashMap 变量。必须立即初始化该变量。
2. 程序不得从键盘读取值。
3. 程序应根据条件将 10 个不同的字符串添加到集合中。
4. printKeys() 方法应显示集合中的键，每行显示一个元素。
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("西姆", "西姆");
        map.put("汤姆", "汤姆");
        map.put("阿勃斯", "阿勃斯");
        map.put("婴儿", "婴儿");
        map.put("猫", "猫");
        map.put("狗", "狗");
        map.put("吃", "吃");
        map.put("食物", "食物");
        map.put("万能激活卡", "万能激活卡");
        map.put("拥抱", "拥抱");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()
             ) {
            String key = pair.getKey();
//            String value = pair.getValue();
            System.out.println(key);
        }
    }
}
