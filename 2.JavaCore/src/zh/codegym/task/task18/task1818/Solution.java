package zh.codegym.task.task18.task1818;

/* 
合二为一
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        String fileName3 = bf.readLine();

        try (FileOutputStream fileOutStream1 = new FileOutputStream(fileName1);
            FileInputStream fileInputStream2 = new FileInputStream(fileName2);
             FileInputStream fileInputStream3 = new FileInputStream(fileName3)) {
            while (fileInputStream2.available() > 0){
                fileOutStream1.write(fileInputStream2.read());
            }
            while (fileInputStream3.available() > 0){
                fileOutStream1.write(fileInputStream3.read());
            }
        }

    }
}
