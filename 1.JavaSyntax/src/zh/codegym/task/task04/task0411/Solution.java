package zh.codegym.task.task04.task0411;

/* 泰若星球上的季节
编写 checkSeason 方法。基于代表月份的数字，该方法应确定并显示季节（冬季、春季、夏季、秋季）。
例如，对于数字 2：
冬季
例如，对于数字 5：
春季
提示：数字 12、1 和 2 是冬季的月份，而 3、4 和 5 是春季的月份，等等。
Requirements:
1. 该程序应在屏幕上显示文本。
2. main 方法不应调用 System.out.println 或 System.out.print。
3. main 方法必须调用 checkSeason 方法。
4. checkSeason 方法必须为 static void，并且只有一个 int 参数。
5. checkSeason 方法应根据任务条件在屏幕上显示文本。
*/
public class Solution {

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //在此编写你的代码
        if (month == 12 || month == 1 || month == 2){
            System.out.println("冬季");
        }else if(month == 3 || month == 4 || month == 5){
            System.out.println("春季");
        }else if(month == 6 || month == 7 || month == 8){
            System.out.println("夏季");
        }else if(month == 9 || month == 10 || month == 11){
            System.out.println("秋季");
        }

    }
}