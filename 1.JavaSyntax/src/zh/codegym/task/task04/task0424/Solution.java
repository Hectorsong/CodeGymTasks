package zh.codegym.task.task04.task0424;

/* 
三个数字
*/

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for (int i = 0 ; i < 3 ; i++){
            String str = br1.readLine();
            array[i] = Integer.valueOf(str);
        }
        if (array[0] == array[1]){
            if (array[1] != array[2]){
                System.out.println("3");
            }
        }else if (array[1] == array[2]){
            System.out.println("1");
        }else if (array[0] == array[2]){
            System.out.println("2");
        }

/*        Set<Integer>sameSet=new HashSet<>();
        for(int element:array) {
            sameSet.add(element);
        }
        if(sameSet.size() != array.length) {
            System.out.println("有相同的元素");
        }*/
    }
}
