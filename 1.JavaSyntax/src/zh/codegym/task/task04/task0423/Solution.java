package zh.codegym.task.task04.task0423;

/* 
保安政策
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
        if (age > 20){
            System.out.println("18 岁就够大了");
        }
    }
}
