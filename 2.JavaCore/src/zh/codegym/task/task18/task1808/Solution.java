package zh.codegym.task.task18.task1808;

/* 
分割文件
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);
//        FileInputStream fileInputStream1 = new FileInputStream("D:/Program File/1.txt");
//        FileOutputStream fileOutputStream2 = new FileOutputStream("D:/Program File/2.txt");
//        FileOutputStream fileOutputStream3 = new FileOutputStream("D:/Program File/3.txt");
        bufferedReader.close();
//        String fileName = args[0] + " " + args[1];
        byte[] byteArray = new byte[fileInputStream1.available() ];
        while (fileInputStream1.available() > 0){
            int count = fileInputStream1.read(byteArray);
            fileOutputStream2.write(byteArray, 0, (count+1)/2);
            fileOutputStream3.write(byteArray, (count+1)/2, count/2);
        }
        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}

