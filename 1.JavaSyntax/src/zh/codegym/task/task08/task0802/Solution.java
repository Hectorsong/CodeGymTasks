package zh.codegym.task.task08.task0802;

/* 包含 10 个对的 HashMap
创建 HashMap<String, String>，并添加 10 个字符串对：
西瓜 - 瓜，
香蕉 - 水果，
樱桃 - 水果，
梨 - 水果，
哈密瓜 - 瓜，
黑莓 - 水果，
人参 - 根，
草莓 - 水果，
鸢尾花 - 花，
土豆 - 块茎。
显示集合的内容，每行显示一个元素。
示例输出（这里只显示一行）：
土豆 - 块茎
Requirements:
1. 声明包含 (String, String) 对的 HashMap 变量并立即初始化该变量。
2. 程序不得从键盘读取值。
3. 程序应根据条件将 10 个字符串对添加到集合中。
4. 程序应在屏幕上显示集合内容，每行显示一个对。
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("西瓜","瓜");
        hashMap.put("香蕉","水果");
        hashMap.put("樱桃","水果");
        hashMap.put("梨","水果");
        hashMap.put("哈密瓜","瓜");
        hashMap.put("黑莓","水果");
        hashMap.put("人参","根");
        hashMap.put("草莓","水果");
        hashMap.put("鸢尾花","花");
        hashMap.put("土豆","块茎");
        for (Map.Entry<String, String> pair: hashMap.entrySet()
             ) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
