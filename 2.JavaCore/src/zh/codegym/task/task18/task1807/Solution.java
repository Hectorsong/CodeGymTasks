package zh.codegym.task.task18.task1807;

/* 
计算逗号的数量
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
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
//        int commaCount = 0;
//        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
//            while (fileInputStream.available() > 0) {
//                if (fileInputStream.read() == 44) commaCount++;
//            }
//        }
        System.out.println(byteArray[44]);
    }
}
