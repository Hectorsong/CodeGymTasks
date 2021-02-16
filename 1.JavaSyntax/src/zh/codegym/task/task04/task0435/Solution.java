package zh.codegym.task.task04.task0435;

/* 偶数
使用 for 循环显示 1 到 100（含 1 和 100）之间的偶数。
每行显示一个值。

Requirements:
1. 程序不得从键盘读取文本。
2. 该程序应在屏幕上显示文本。
3. 程序应显示 1 到 100（含 1 和 100）之间的偶数。每行显示一个值。
4. 程序必须使用 for 循环。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        for(int i = 1; i <= 100; i++){
            if (i%2 == 0)
                System.out.println(i);
        }
    }
}
