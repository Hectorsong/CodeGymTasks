package zh.codegym.task.task06.task0606;

import java.io.*;

/* 
偶数和奇数
使用键盘输入一个数字。确定输入数字中的偶数和奇数的数量。
如果一个数字可被 2 整除而没有余数（即，余数为零），则该数为偶数。
然后，我们将偶数计数器（static 变量 even）加 1。
否则，该数为奇数，我们将增加奇数计数器（static 变量 odd）。
显示以下消息：“偶数：a 奇数：b”，其中 a 为偶数的数量，b 为奇数的数量。
例如，对于 4445：
偶数：3 奇数：1
Requirements:
1. 程序必须从键盘读取数据。
2. main 方法应计算输入数字中偶数的数量，然后将此数字写入变量 even。
3. main 方法应计算输入数字中奇数的数量，然后将此数字写入变量 odd。
4. 程序应在屏幕上显示文本。
5. 所显示的文本必须与任务条件匹配。
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String string = br1.readLine();
        int numberDigit = string.length();
        int number = Integer.parseInt(string);
        int temp = number;
        for (int i = numberDigit ; i > 0 ; i--){
            if (temp / (int)(Math.pow(10,i-1)) % 2 == 0){
                even++;
            }else odd++;
            temp = temp % (int)(Math.pow(10,i-1));
        }


        System.out.println("偶数：" + even + " 奇数：" + odd);
    }
}
