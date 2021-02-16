package zh.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 包含猫的 HashMap
有一个包含 String name 的 Cat 类。
创建 HashMap<String, Cat>。
向该集合中添加 10 个猫。猫的名字应用作键。
在屏幕上显示结果，每行显示一个元素。
Requirements:
1. 程序不得从键盘读取值。
2. 在 addCatsToMap() 方法中，声明包含 (String, Cat) 对的 HashMap 变量并立即初始化该变量。
3. addCatsToMap() 方法应根据任务条件将 String[] cats 数组中的所有猫添加到集合中。
4. 程序应在屏幕上显示集合内容，每行显示一个对，并且键和值之间用连字符分隔。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"泰格", "米西", "斯摩基", "果酱", "奥斯卡", "雪球", "博斯", "斯马奇", "马克斯", "辛巴"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> hashMap1 = new HashMap<>();
        for (int i = 0; i < cats.length; i++){
            Cat cat = new Cat(cats[i]);
            hashMap1.put(cats[i], cat);
        }
        return hashMap1;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
