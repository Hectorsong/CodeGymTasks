package zh.codegym.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 方法四重奏
实现 4 个方法。
其中每个方法都应返回最适合执行这些操作的列表（即，可以最快执行大量操作的列表）。
不需要测量任何东西。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. Solution 类只能包含 5 个方法。
3. getListForGet 方法应返回最适合 get 操作的列表。
4. getListForSet 方法应返回最适合 set 操作的列表。
5. getListForAddOrInsert 方法应返回最适合添加或插入元素的列表。
6. getListForRemove 方法应返回最适合删除元素的列表。
*/

public class Solution {
    public static List getListForGet() {
        ArrayList list = new ArrayList();
        return list;
    }

    public static List getListForSet() {
        ArrayList list = new ArrayList();
        return list;
    }

    public static List getListForAddOrInsert() {
        LinkedList list = new LinkedList();
        return list;
    }

    public static List getListForRemove() {
        LinkedList list = new LinkedList();
        return list;
    }

    public static void main(String[] args) {

    }
}
