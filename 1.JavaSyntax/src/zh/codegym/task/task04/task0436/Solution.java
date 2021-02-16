package zh.codegym.task.task04.task0436;


/* 画矩形
使用键盘输入两个数字 m 和 n。
使用 for 循环显示一个由 8 组成的 n x m 矩形。
下面是一个示例： m=2，n=4
8888
8888
Requirements:
1. 程序应从键盘读取两个数字。
2. 该程序应在屏幕上显示文本。
3. 程序应显示由 8 组成的 n x m 矩形。
4. 程序必须使用 for 循环。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[2];
        for (int i = 0 ; i < 2 ; i++){
            String str = br1.readLine();
            array1[i] = Integer.parseInt(str);
        }
        for (int i = 0; i < array1[0]; i++){
            for (int j = 0; j < array1[1]; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
