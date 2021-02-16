package zh.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
数量最大的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int maxByte = 0;

        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (data > maxByte) maxByte = data;
        }
        inputStream.close();
        System.out.println(maxByte);
    }
}
