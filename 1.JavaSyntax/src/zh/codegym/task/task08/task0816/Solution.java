package zh.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 善良的艾玛和暑假
创建 Map<String, Date> 并添加十个表示（姓氏、出生日期）对的条目。
从映射中删除夏季出生的所有人。
提示：在 CodeGym，夏季从 6 月 1 日持续到 8 月 31日。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. createMap() 方法必须创建并返回包含 (String, Date) 元素且包含 10 个条目的 HashMap。
4. removeAllSummerPeople() 方法应从映射中删除夏季出生的所有人。
*/
public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("史泰龙", df.parse("JUNE 1 1980"));
        map.put("Hector", df.parse("JULY 1 1980"));
        map.put("Lufei", df.parse("JUNE 1 1980"));
        map.put("Xiangji", df.parse("JUNE 1 1980"));
        map.put("Namei", df.parse("JULY 4 1918"));
        map.put("Qiaoba", df.parse("MAY 29 1970"));
        map.put("Bluk", df.parse("JUNE 1 1980"));
        map.put("Suolong", df.parse("MARCH 10 1917"));
        map.put("Luobing", df.parse("JUNE 1 1980"));
        map.put("Frake", df.parse("JULY 4 1950"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMM d", Locale.ENGLISH);
        Date dateStart = df.parse("JUNE 1");
        Date dateEnd = df.parse("August 31");
        Iterator<Map.Entry<String , Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
/*            Date date = iterator.next().getValue();
            date.getTime();
            if (dateEnd.after(date) ){
                if (dateStart.before(date)) iterator.remove();
            }*/

            Date date = iterator.next().getValue();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int month = cal.get(Calendar.MONTH);
            if ((month >= 5) && (month <= 7)) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
        try {
            HashMap<String , Date> map = createMap();
            removeAllSummerPeople(map);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
