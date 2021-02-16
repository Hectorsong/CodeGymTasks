package zh.codegym.task.task04.task0427;

/* 描述数字
从键盘输入 1 - 999 之间的整数。按如下所示显示字符串描述：
“一位偶数”- 如果数字为偶数且包含一位数字，
“一位奇数”- 如果数字为奇数且包含一位数字，
“两位偶数”- 如果数字为偶数且包含两位数字，
“两位奇数”- 如果数字为奇数且包含两位数字，
“三位偶数”- 如果数字为偶数且包含三位数字，
“三位奇数”- 如果数字为奇数且包含三位数字。
如果输入的数字不在 1 - 999 之间，则不显示任何内容。
例如，对于 100：
三位偶数
例如，对于数字 51：
两位奇数
Requirements:
1. 程序应从键盘读取一个数字。
2. 程序应使用 System.out.println() 或 System.out.print()。
3. 程序应显示数字的字符串描述，此外不显示其他任何内容。
4. 如果数字为偶数且包含一位数字，则显示“一位偶数”。
5. 如果数字为奇数且包含一位数字，则显示“一位奇数”。
6. 如果数字为偶数且包含两位数字，则显示“两位偶数”。
7. 如果数字为奇数且包含两位数字，则显示“两位奇数”。
8. 如果数字为偶数且包含三位数字，则显示“三位偶数”。
9. 如果数字为奇数且包含三位数字，则显示“三位奇数”。
10. 如果输入的数字不在 1 - 999 之间，则不显示任何内容。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[1];
        for (int i = 0 ; i < 1 ; i++){
            String str = br1.readLine();
            array1[i] = Integer.parseInt(str);
        }
        if(array1[0] >= 1 && array1[0] <= 999){
            if (array1[0]/100 > 0){
                if (array1[0]%2 == 0){
                    System.out.println("三位偶数");
                }else System.out.println("三位奇数");
            }else if(array1[0]/10 > 0){
                if (array1[0]%2 == 0){
                    System.out.println("两位偶数");
                }else System.out.println("两位奇数");
            }else {
                if (array1[0]%2 == 0){
                    System.out.println("一位偶数");
                }else System.out.println("一位奇数");
            }
        }

    }
}
