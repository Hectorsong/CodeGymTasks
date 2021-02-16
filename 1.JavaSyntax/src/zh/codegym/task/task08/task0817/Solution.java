package zh.codegym.task.task08.task0817;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 我们不需要重复的内容
创建 Map<String, String> 并添加十个表示（姓氏、名字）对的条目。
删除具有相同名字的人。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. createMap() 方法必须创建并返回包含 (String, String) 元素且包含 10 个条目的 HashMap。
4. removeFirstNameDuplicates() 方法必须从映射中删除具有相同名字的所有人。
5. removeFirstNameDuplicates() 方法必须调用 removeItemFromMapByValue() 方法
*/
public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String , String> map = new HashMap<>();
        map.put("史泰龙", "JUNE 1 1980");
        map.put("Hector", "JULY 1 1980");
        map.put("Lufei", "JUNE 1 1980");
        map.put("Xiangji", "JUNE 1 1980");
        map.put("Namei", "JULY 4 1918");
        map.put("Qiaoba", "MAY 29 1970");
        map.put("Bluk", "JULY 4 1918");
        map.put("Suolong", "MARCH 10 1917");
        map.put("Luobing", "JUNE 1 1980");
        map.put("Frake", "JULY 4 1950");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashSet<String> copy = new HashSet<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
/*        while (iterator.hasNext()){
            removeItemFromMapByValue(map , iterator.next().getValue());
        }*/
        for (Map.Entry<String , String> pair1: map.entrySet()) {
            for (Map.Entry<String , String> pair2: map.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()) && !pair1.equals(pair2)){
                    copy.add(pair1.getValue());
                    //return;
                }
            }
        }
        for (String s : copy) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String , String> map = createMap();
        removeFirstNameDuplicates(map);
    }
}
