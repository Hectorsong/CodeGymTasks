package zh.codegym.task.task04.task0433;


/* 
看看你将在未来拥有的美元
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        int i = 0;
        while (i < 10){
            int j = 0;
            while (j < 10){
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
