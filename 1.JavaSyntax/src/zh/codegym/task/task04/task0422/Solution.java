package zh.codegym.task.task04.task0422;

/* 
18 岁以上
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[2];
        for (int i = 0 ; i < 2 ; i++){
            String str = br1.readLine();
            array[i] = str;
        }
        int age = Integer.valueOf(array[1]);
        if (age < 18){
            System.out.println("再长大一点");
        }
    }
}
