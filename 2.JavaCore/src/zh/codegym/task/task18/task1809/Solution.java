package zh.codegym.task.task18.task1809;

/* 
反转文件
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

//        FileInputStream fileInputStream1 = new FileInputStream("D:/Program File/1.txt");
//        FileOutputStream fileOutputStream2 = new FileOutputStream("D:/Program File/2.txt");

        bufferedReader.close();
//        String fileName = args[0] + " " + args[1];
        byte[] byteArray = new byte[fileInputStream1.available()];
        byte[] byteArray1 = new byte[fileInputStream1.available()];
        while (fileInputStream1.available() > 0){
            int count = fileInputStream1.read(byteArray);
            for (int i = 0; i < byteArray.length; i++) {
                byteArray1[byteArray.length - i - 1] = byteArray[i];
            }
            fileOutputStream2.write(byteArray1);

        }

        /*List<Integer> inputBytes = new ArrayList<>();
        while (fileInputStream1.available() > 0) {
            inputBytes.add(fileInputStream1.read());
        }
        Collections.reverse(inputBytes);
        for (Integer aByte : inputBytes) {
            fileOutputStream2.write(aByte);
        }*/

        fileInputStream1.close();
        fileOutputStream2.close();
    }
}
