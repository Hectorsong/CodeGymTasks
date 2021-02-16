package zh.codegym.task.task18.task1819;

/* 
合并文件
*/

import java.io.*;

public class Solution {
   /* public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        String tempFile = "temp.txt";
        bf.close();

        try (FileOutputStream fileOutStream1 = new FileOutputStream(fileName1);
             FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2);
             FileOutputStream fileOutputStream3 = new FileOutputStream(tempFile)) {
            while (fileInputStream2.available() > 0){
                fileOutputStream3.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0){
                fileOutputStream3.write(fileInputStream1.read());
            }
            fileOutStream1.write(new FileInputStream(tempFile));
        }

    }*/
    //解法一
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileInputStream2.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        fileOutputStream1.write(buffer2);
        fileOutputStream1.close();

        FileOutputStream fileOutputStream11 = new FileOutputStream(fileName1, true);
        fileOutputStream11.write(buffer1);
        fileOutputStream11.close();
    }
    //解法二
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }*/
}