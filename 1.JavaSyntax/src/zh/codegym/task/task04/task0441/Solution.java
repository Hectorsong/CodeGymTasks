package zh.codegym.task.task04.task0441;


/* 设法达到均衡
使用键盘输入三个数字，然后显示中间数。
换言之，不是最大数，也不是最小数。
如果所有数字都相等，则显示其中任一数字。

Requirements:
1. 程序应从键盘读取这些数字。
2. 程序必须在屏幕上显示一个数字。
3. 程序应显示三个数字的中间数。
4. 如果所有数字都相等，则显示其中任一数字。
5. 如果三个数字中的两个数字相等，则显示这两个数字中的任意一个。
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[3];
        for (int i = 0 ; i < 3 ; i++){
            String str = br1.readLine();
            array1[i] = Integer.parseInt(str);
        }
        Arrays.sort(array1);
        System.out.println(array1[1]);
    }
}
