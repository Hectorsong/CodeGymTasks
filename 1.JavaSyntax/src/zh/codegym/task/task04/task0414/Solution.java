package zh.codegym.task.task04.task0414;

/* 这一年包含的天数
使用键盘输入一个年份，然后确定这一年包含的天数。按如下所示显示结果：
这一年包含的天数：x
，
如果是闰年，则 x 为 366，
如果是平年，则 x 为 365。
提示：
闰年包含 366 天，而平年包含 365 天。
1) 如果该年份能被 400 整除，则为闰年；
2) 对于其他年份，如果能被 100 整除，则为平年；
3) 对于其他年份，如果能被 4 整除，则为闰年；
4) 所有其余年份都不是闰年。
因此，1700、1800 和 1900 年都不是闰年，因为它们是 100 的倍数但不是 400 的倍数。
1600 和 2000 年都是闰年，因为它们同时是 100 和 400 的倍数。
2100、2200 和 2300 年不是闰年。
Requirements:
1. 程序应从键盘读取数字。
2. 程序应根据任务条件在屏幕上显示文本。
3. 如果输入的年份是闰年，则应显示：“这一年包含的天数：366”。
4. 如果输入的年份不是闰年，则应显示：“这一年包含的天数：365”。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();
        int i = Integer.parseInt(str);
        if (i%400 == 0){
            System.out.println("这一年包含的天数：366");
        }else if(i%100 == 0){
            System.out.println("这一年包含的天数：365");
        }else if(i%4 == 0){
            System.out.println("这一年包含的天数：366");
        }else
            System.out.println("这一年包含的天数：365");
    }
}