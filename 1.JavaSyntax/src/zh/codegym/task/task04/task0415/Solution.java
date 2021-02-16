package zh.codegym.task.task04.task0415;

/* 
三角形法则
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
        int temp;
        if(i + j > k && i + k > j && j + k > i){
            System.out.println("三角形可能存在。");
        }else {
            System.out.println("三角形不可能存在。");
        }
    }
}