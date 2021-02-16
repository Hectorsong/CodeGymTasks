package zh.codegym.task.task09.task0922;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 今天是几号？
按格式“2013-08-18”输入日期
以“AUG 18, 2013”格式显示日期。
使用 Date 对象和 SimpleDateFormat。
Requirements:
1. 程序必须从键盘读取数据。
2. 必须在程序中声明 SimpleDateFormat 变量。
3. 必须在程序中声明 Date 变量。
4. 程序应在屏幕上显示数据。
5. 输出必须与任务条件匹配。
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(bufferedReader.readLine());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd, yyyy" , Locale.ENGLISH);
            String str = simpleDateFormat1.format(date);
            System.out.println(str.toUpperCase());
        }catch (ParseException e){
            System.out.println(e);
        }
    }
}
