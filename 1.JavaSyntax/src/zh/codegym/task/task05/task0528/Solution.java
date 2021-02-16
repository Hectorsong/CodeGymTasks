package zh.codegym.task.task05.task0528;

/* 显示今天的日期
使用以下格式显示当前日期：“06 15 2018”。
Requirements:
1. 日期必须包含月份、日期和年份，并以空格分隔。
2. 月份必须与当前月份一致。
3. 日期必须与当前日期一致。
4. 年份必须与当前年份一致。
5. 整个日期应显示在一行上。
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("MM dd yyyy");//设置日期格式
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }
}
