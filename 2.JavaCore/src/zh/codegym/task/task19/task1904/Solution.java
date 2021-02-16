package zh.codegym.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
另一个适配器
*/

public class Solution {

    public static void main(String[] args) {
        Person adapter = new Person(
                "约翰", "迈克尔", "彼得森",
                        new Date(1950, 12, 31));
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] split = str.split(" ");
            /*对于java中Calendar和baiGregorianCalendar的duget方法返回的MONTH代表的整型值，
            0代表1月，11代表12月。
            创建一个代表2009年6月12号的Date对象
            Date d1 = new Date(2009-1900, 6-1, 12); （注意参数的设置啊！）
            */
            //解法一
            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[3]) - 1, Integer.parseInt(split[4]));
            Date date1 = calendar.getTime();
            return new Person(split[2], split[0], split[1], date1);

            //解法二
            /*Date date2 = new Date(Integer.parseInt(split[5])-1900, Integer.parseInt(split[3])-1, Integer.parseInt(split[4]));
            return new Person(split[2], split[0], split[1], date2);*/
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
