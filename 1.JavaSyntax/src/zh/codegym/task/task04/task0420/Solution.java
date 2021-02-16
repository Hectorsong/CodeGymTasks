package zh.codegym.task.task04.task0420;

/* 
对三个数字进行排序
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for (int i = 0 ; i < 3 ; i++){
            String str = br1.readLine();
            array[i] = Integer.parseInt(str);
        }
        Arrays.sort(array);
        for (int i = 2 ; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }
}
