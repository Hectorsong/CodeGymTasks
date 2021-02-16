package zh.codegym.task.task03.task0312;

/* 
时间转换
*/

public class Solution {
    //在此编写你的代码

    public static void main(String[] args) {
        //在此编写你的代码
        System.out.println(convertToSeconds(60));
        System.out.println(convertToSeconds(50));
    }

    public static int convertToSeconds (int hours){
        return hours * 60 * 60;
    }
}
