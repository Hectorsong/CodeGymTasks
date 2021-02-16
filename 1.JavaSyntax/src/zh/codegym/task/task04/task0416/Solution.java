package zh.codegym.task.task04.task0416;

/* 蒙眼过马路
行人交通信号灯的编程如下：
在每小时开始时，绿色信号灯点亮三分钟，
接下来黄色信号灯点亮一分钟，
然后红色信号灯点亮一分钟。
接下来绿色信号灯再次点亮三分钟，以此类推。
使用键盘输入一个实际的数字 t，用于表示从小时开始后经过的分钟数。
确定在指定时间什么颜色的交通信号灯处于点亮状态。
按如下所示显示结果：
如果绿灯点亮，则为“绿色”，
如果黄灯点亮，则为“黄色”，
如果红灯点亮，则为“红色”。

例如，对于 2.5：
绿色
例如，对于 3：
黄色
例如，对于 4：
红色
例如，对于 5：
绿色


Requirements:
1. 程序应从键盘读取一个实际数字。
2. 该程序应在屏幕上显示文本。
3. 如果绿灯点亮，则显示：“绿色”
4. 如果黄灯点亮，则显示：“黄色”
5. 如果红灯点亮，则显示：“红色”
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();
        double i = Double.parseDouble(str);
//        double j = i % 5;
        if( i%5 < 3 && i%5 >= 0){
            System.out.println("绿色");
        }else if ( i%5 < 4){
            System.out.println("黄色");
        }else if ( i%5 < 5){
            System.out.println("红色");
        }
    }
}