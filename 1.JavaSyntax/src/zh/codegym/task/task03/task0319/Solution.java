package zh.codegym.task.task03.task0319;

/* 
预测
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        int amount = s1.nextInt();
        s1.nextLine();
        String years = s1.nextLine();


//        int amount = s1.nextInt();
        System.out.println(name + "将在 "+ years +" 年后收到 "+ amount + "。");
    }
}
