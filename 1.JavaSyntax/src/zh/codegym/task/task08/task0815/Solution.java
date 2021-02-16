package zh.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 人口普查
创建 Map<String, String> 并添加十个表示（姓氏、名字）对的条目。
检查有多少人具有相同的名字或姓氏。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. createMap() 方法必须创建并返回包含 (String, String) 元素的 HashMap，且该 HashMap 包含表示（姓氏、名字）对的 10 个条目。
4. getSameFirstNameCount() 方法必须返回具有相同名字的人员的数量。
5. getSameLastNameCount() 方法必须返回具有相同姓氏的人员的数量。
*/
public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String , String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Hector" + i, "Hector");
        }
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int countName = 0;
        while (iterator.hasNext()){
            if ( name.equals(iterator.next().getValue())){
                countName++;
            }
        }
        return countName;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String , String >> iterator = map.entrySet().iterator();
        int countLastName = 0;
        while (iterator.hasNext()){
            if ( lastName.equals(iterator.next().getKey())){
                countLastName++;
            }
        }
        return countLastName;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        getSameFirstNameCount(map , "Hector");
        System.out.println(getSameFirstNameCount(map , "Hector"));
        getSameLastNameCount(map , "Hector1");
        System.out.println(getSameLastNameCount(map , "Hector1"));
    }
}
