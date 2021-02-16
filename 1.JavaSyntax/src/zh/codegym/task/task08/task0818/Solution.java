package zh.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 只针对富人
创建 Map<String, Integer> 并添加表示（姓氏、薪水）对的十个条目。
从映射中删除薪水低于 500 的所有人。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. createMap() 方法必须创建并返回包含 (String, Integer) 元素的 HashMap，且该 HashMap 包含表示（姓氏、薪水）对的 10 个条目。
4. removeItemFromMap() 方法必须从映射中删除薪水低于 500 的所有人。
*/
public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("史泰龙", 400);
        hashMap.put("Hector", 500);
        hashMap.put("Lufei", 100);
        hashMap.put("Xiangji", 1000);
        hashMap.put("Namei", 300);
        hashMap.put("Qiaoba", 0);
        hashMap.put("Bluk", 520);
        hashMap.put("Suolong", 380);
        hashMap.put("Luobing", 500);
        hashMap.put("Frake", 1024);
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String , Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            int salary = iterator.next().getValue();
            if (salary < 500){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = createMap();
        removeItemFromMap(hashMap);




        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put (212133, "Bridget Logan");
        passportsAndNames.put (162348, "Ivan the Great");
        passportsAndNames.put(8082771, "Donald John Trump");

        passportsAndNames2.put(917352, "Clifford Patrick");
        passportsAndNames2.put(925648, "Mitchell Salgado");

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);
        for (Map.Entry<Integer, String> entry: passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

    }
}