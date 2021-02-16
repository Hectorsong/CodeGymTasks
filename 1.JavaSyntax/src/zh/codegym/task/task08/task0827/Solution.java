package zh.codegym.task.task08.task0827;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

/* 处理日期
1.实现 isDateOdd(String date) 方法，如果自年初以来的天数为奇数，该方法将返回 true，否则返回 false
2.String date 以如下形式传递：FEBRUARY 1 2013
别忘了将该年度的第一天考虑在内。
示例：
JANUARY 1 2000 = true
JANUARY 2 2020 = false
Requirements:
1. 程序应在屏幕上显示文本。
2. Solution 类必须包含两个方法。
3. 如果自年初以来的天数为奇数，isDateOdd() 方法必须返回 true，否则必须返回 false。
4. main() 方法应调用 isDateOdd() 方法
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        int yearDay = 0;
        String[] splitDate = date.split(" ");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        int year = Integer.parseInt(splitDate[2]);
        linkedHashMap.put("JANUARY", 31);
        linkedHashMap.put("FEBRUARY", year%400 == 0 || (year %4 == 0 && year %100 != 0)?29:28);
        linkedHashMap.put("MARCH" , 31);
        linkedHashMap.put("APRIL", 30);
        linkedHashMap.put("MAY", 31);
        linkedHashMap.put("JUNE", 30);
        linkedHashMap.put("JULY", 31);
        linkedHashMap.put("AUGUST", 31);
        linkedHashMap.put("SEPTEMBER", 30);
        linkedHashMap.put("OCTOBER", 31);
        linkedHashMap.put("NOVEMBER", 30);
        linkedHashMap.put("DECEMBER", 31);

        Iterator<Map.Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals(splitDate[0])){
                yearDay = yearDay + Integer.parseInt(splitDate[1]);
                break;
            }else yearDay = yearDay + entry.getValue();
        }
        boolean isOddDate = yearDay%2 == 0? false:true;
        return isOddDate;
    }

}
