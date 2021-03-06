package zh.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 字符串列表数组
创建一个元素是字符串列表的数组。
在数组中填入任意数据并在屏幕上显示。
Requirements:
1. createList 方法必须声明并初始化含 ArrayList<String> 元素的数组。
2. createList 方法必须返回创建的数组。
3. createList 方法必须在数组中添加 5 个元素（字符串列表）。这些列表不能为空。
4. 程序应在屏幕上显示数据。
5. main 方法必须调用 createList 方法。
6. main 方法必须调用 printList 方法。
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new  ArrayList[5];
        for (int i = 0; i < 5; i++) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("String");
            arrayLists[i] = arrayList;
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}