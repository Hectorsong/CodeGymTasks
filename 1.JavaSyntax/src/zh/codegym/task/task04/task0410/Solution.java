package zh.codegym.task.task04.task0410;

/*
来吧，幸运七！
编写 checkInterval 方法。该方法应检查某个整数是否在 50 到 100  这个范围之内，并在屏幕上显示结果，如下所示：“数字 a 不在此范围内。”或“数字 a 在此范围内。”，其中 a 是方法参数。
例如，对于数字 112：
数字 112 不在此范围内。
例如，对于数字 60：
数字 60 在此范围内。
Requirements:
1. 该程序应在屏幕上显示文本。
2. main 方法不应调用 System.out.println 或 System.out.print()。
3. main 方法必须调用 checkInterval 方法。
4. checkInterval 方法必须为 static void。
5. checkInterval 方法应根据任务条件在屏幕上显示文本。*/

public class Solution {

    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //在此编写你的代码
        if (a>50){
            if (a<100){
                System.out.println("数字 " + a +" 在此范围内。");
            }else
                System.out.println("数字 " + a + " 不在此范围内。");
        }else
            System.out.println("数字 " + a + " 不在此范围内。");

    }
}