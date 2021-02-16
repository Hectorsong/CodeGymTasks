package zh.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
数量最小的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int minByte = 255;

        while (inputStream.available() > 0) //如果存在未读字节
        {
            int data = inputStream.read(); //读取下一个字节
            if (data < minByte) minByte = data;
        }
        inputStream.close(); // 关闭流

        System.out.println(minByte);
    }
}
