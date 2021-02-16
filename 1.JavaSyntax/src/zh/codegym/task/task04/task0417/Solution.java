package zh.codegym.task.task04.task0417;

/* 
是否有一对？
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br1.readLine();
        int i = Integer.parseInt(str1);
        String str2 = br1.readLine();
        int j = Integer.parseInt(str2);
        String str3 = br1.readLine();
        int k = Integer.parseInt(str3);
        if (i == j){
            if (j == k) System.out.println(i + " " + j + " " + k);
            else System.out.println(i + " " + j);
        }else if(i == k){
            System.out.println(i + " " + k);
        }else if(j == k){
            System.out.println(j + " " + k);
        }

    }
}