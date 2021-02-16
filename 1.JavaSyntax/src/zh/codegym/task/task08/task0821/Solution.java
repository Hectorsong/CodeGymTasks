package zh.codegym.task.task08.task0821;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
共享的姓氏和名字
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //在此编写你的代码
        HashMap<String , String> map = new HashMap<String , String>();
        map.put("Bbb", "Casey");
        map.put("Ccc", "Casey");
        map.put("Ddd", "Casey");
        map.put("Eee", "Casey");
        map.put("Fff", "Tyler");
        map.put("Ggg", "Tyler");
        map.put("Hhh", "Tyler");
        map.put("Iii", "Matt");
        map.put("Ccc", "Tyler");
        map.put("Bbb", "Lucas");
/*
        HashMap<String , List> map = new HashMap<String , List>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        map.put("1",list1);
        map.put("2",list2);*/

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
