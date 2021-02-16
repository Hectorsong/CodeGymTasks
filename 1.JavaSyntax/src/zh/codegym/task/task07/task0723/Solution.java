package zh.codegym.task.task07.task0723;

/* 倒数
编写一个程序，从 30 开始倒数到 0，然后显示“呯！”。
程序应每秒倒数 10 次。要给程序增加延迟，请使用：
Thread.sleep(100); // 延迟十分之一秒。
例如：
30
29
…
1
0
呯！
Requirements:
1. 程序不得从键盘读取数据。
2. 程序应显示从 30 倒数到 0。每行显示一个数字。
3. 倒数结束后程序应显示“呯！”。
4. 程序应使用“Thread.sleep (100);”31 次。
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //在此编写你的代码
        }

        System.out.println("呯！");
    }
}
