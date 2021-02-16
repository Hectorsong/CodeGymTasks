package zh.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 包含对象的 HashMap
有一个 HashMap<String, Object>。已向其中添加了 10 个不同的对象对。
显示集合的内容，每行显示一个元素。
示例输出（这里只显示一行）：
西姆 - 5
Requirements:
1. 程序必须创建包含 (String, Object) 元素的 HashMap 变量。必须立即初始化该变量。
2. 程序不得从键盘读取值。
3. 程序应根据条件将 10 个不同的对象添加到集合中。
4. 程序应在屏幕上显示集合内容，每行显示一个对。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("西姆", 5);
        map.put("汤姆", 5.5);
        map.put("阿勃斯", false);
        map.put("婴儿", null);
        map.put("猫", "猫");
        map.put("吃", new Long(56));
        map.put("食物", new Character('3'));
        map.put("万能激活卡", '6');
        map.put("拥抱", 111111111111L);
        map.put("康普", (double) 123);

        for (Map.Entry<String , Object> pair: map.entrySet()
             ) {
            String str = pair.getKey();
            Object obj = pair.getValue();
            System.out.println(str + " - " + obj);
        }

    }
}
