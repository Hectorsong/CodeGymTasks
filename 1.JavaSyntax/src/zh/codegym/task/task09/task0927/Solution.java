package zh.codegym.task.task09.task0927;
import java.util.*;

/* 十只猫
有一个含 String 变量 name 的 Cat 类。
创建一个 Map<String, Cat> 并添加 10 只猫，用（name，Cat）对表示。
从 Map 中获取所有猫的集，并显示在屏幕上。
Requirements:
1. 程序不得从键盘读取数据。
2. createMap 方法必须创建一个新的 HashMap<String, Cat> 对象。
3. createMap 方法必须在映射中添加 10 只猫，用（名称，猫）对表示。
4. createMap 方法必须返回创建的映射。
5. convertMapToSet 方法必须创建并返回从传递的映射中检索到的猫的集。
6. 程序应显示集中的所有猫。
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String , Cat> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("name"+i , new Cat("cat" + i));
        }
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> hashSet = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String , Cat> entry = iterator.next();
            hashSet.add(entry.getValue());
        }
        return hashSet;
    }
/*  (1) for each map.entrySet()
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, String> entry = iterator.next();
        entry.getKey();
        entry.getValue();
    }
*/
/*    (2) 显示调用map.entrySet()的集合迭代器
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, String> entry = iterator.next();
        entry.getKey();
        entry.getValue();
}*/
/*
    (3) for each map.keySet()，再调用get获取
    Map<String, String> map = new HashMap<String, String>();
    for (String key : map.keySet()) {
        map.get(key);
}*/
/*
    (4) for each map.entrySet()，用临时变量保存map.entrySet()
    Set<Entry<String, String>> entrySet = map.entrySet();
    for (Entry<String, String> entry : entrySet) {
        entry.getKey();
        entry.getValue();
}
*/


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
