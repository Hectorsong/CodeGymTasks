package zh.codegym.task.task04.task0437;


/* 由 8 组成的三角形
使用 for 循环显示由 8 组成的直角三角形，底边为 10，高为 10。
屏幕输出示例：
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
Requirements:
1. 程序不得从键盘读取数字。
2. 程序应在屏幕上显示数字。
3. 程序应显示由 8 组成的直角三角形，底边为 10，高为 10。
4. 程序必须使用 for 循环。
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
