package zh.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
最少的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
//        String fileName = args[0] + " " + args[1];
        int[] byteArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){//try语句中直接关闭
            while (fileInputStream.available() > 0){
                byteArray[fileInputStream.read()] += 1;
            }
        }
        int minCount = 255;
        for (int temp : byteArray) {
//            if (temp < minCount) minCount = temp;
            if (temp > 0 && temp < minCount) minCount = temp;
            //temp必须>0，否则很多文件中不包含的字节，在数组中的字节数量都是0。
        }
        ArrayList<Integer> byteList = new ArrayList<>();
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == minCount) byteList.add(i);
        }
        for (Integer temp : byteList) {
            System.out.print(temp + " ");
        }
    }
}

