package zh.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
升序数字
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[5];
        for (int i = 0 ; i < 5 ; i++){
            array1[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array1);
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(array1[i]);
        }
        //在此编写你的代码
    }
}
