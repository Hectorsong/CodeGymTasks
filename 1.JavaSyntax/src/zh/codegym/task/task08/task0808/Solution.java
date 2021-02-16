package zh.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 一万次删除和插入
使用 ArrayList 和 LinkedList 执行 10000 次插入、删除以及 get 和 set 调用。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. Solution 类只能包含 5 个方法。
4. insert10000(List list) 方法必须向列表中插入 10000 个项目。
5. get10000(List list) 方法应对列表调用 10000 次 get。
6. set10000(List list) 方法应对列表调用 10000 次 set。
7. remove10000(List list) 方法应从列表中删除 10000 个项目。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new LinkedList<>();
//        if(list.getClass().toString() == "java.util.ArrayList"){
//            list1 = list;
//        }else if (list.getClass().toString() == "java.util.LinkedList"){
//            list2 = list;
//        }
        for (int i = 0 ; i < 10000 ; i++){
            list.add(i);
        }

    }

    public static void get10000(List list) {
        for (int i = 0 ; i < 10000 ; i++){
            list.get(i);
        }
    }

    public static void set10000(List list) {
        for (int i = 0 ; i < 10000 ; i++){
            list.set(i, i);
        }

    }

    public static void remove10000(List list) {
        for (int i = 0 ; i < 10000 ; i++){
            list.remove(0);
        }
    }
}
