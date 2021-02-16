package zh.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
纠正四个错误
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        initList(list);
        printListValues(list);
        processCastObjects(list);
    }

    public static void initList(List<Number> list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    public static void printListValues(List<Number> list){
        // 4 - 更正 2 个错误
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void processCastObjects(List<Number> list){
        // 5
        for (Number object : list) {
            // 更正 2 个错误
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("是否已定义 float？" + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("是否已定义 double？" + a.isInfinite());
            }
        }
    }
}
