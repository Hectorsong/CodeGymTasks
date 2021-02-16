package zh.codegym.task.task04.task0408;

/* 
好还是不好？
*/
/*
* 好还是不好？
编写 compare(int a) 方法，使其完成以下操作：
- 如果方法参数小于 5，则显示“数字小于 5”；
- 如果方法参数大于 5，则显示“数字大于 5”；
- 如果方法参数等于 5，则显示“数字等于 5”。
Requirements:
1. 该程序应在屏幕上显示文本。
2. main 方法不应调用 System.out.println 或 System.out.print。
3. main 方法应调用 compare 方法。
4. compare 方法必须为 void。
5. compare 方法应根据任务条件在屏幕上显示文本。
* */

public class Solution {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //在此编写你的代码
        if (a == 5){
            System.out.println("数字等于 5");
        }else if(a > 5){
            System.out.println("数字大于 5");
        }else {
            System.out.println("数字小于 5");
        }

    }
}