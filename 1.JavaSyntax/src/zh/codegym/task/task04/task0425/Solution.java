package zh.codegym.task.task04.task0425;

/* 
使用键盘输入两个整数，以表示不在坐标轴上的点的坐标。
显示包含给定点的象限的编号。

提示：
如果满足以下条件，则点 (a,b) 属于某个象限：
对于第一象限：a>0 且 b>0；
对于第二象限：a<0 且 b>0；
对于第三象限：a<0 且 b<0；
对于第四象限：a>0 且 b<0。
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[2];
        for (int i = 0 ; i < 2 ; i++){
            String str = br1.readLine();
            array[i] = Integer.valueOf(str);
        }
        if (array[0] > 0 && array[1] > 0){
            System.out.println("1");
        }else if (array[0] < 0 && array[1] > 0){
            System.out.println("2");
        }else if (array[0] < 0 && array[1] < 0){
            System.out.println("3");
        }else if (array[0] > 0 && array[1] < 0){
            System.out.println("4");
        }
    }
}
