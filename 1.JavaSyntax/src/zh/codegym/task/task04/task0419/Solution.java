package zh.codegym.task.task04.task0419;

/* 
四个数字中的最大值
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[4];
        for (int i = 0 ; i < 4 ; i++){
            String str = br1.readLine();
            array[i] = Integer.parseInt(str);
        }
        Arrays.sort(array);
        System.out.println(array[3]);
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }
}
