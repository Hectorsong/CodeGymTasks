package zh.codegym.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String fileName1 = bufferedReader.readLine();
            FileInputStream fileInputStream1 = new FileInputStream(fileName1);
            if (fileInputStream1.available() < 1000) {
                fileInputStream1.close();
                throw new DownloadException();
            }
            fileInputStream1.close();
        }
    }

        /*while (true){
            String fileName1 = bufferedReader.readLine();

            try(FileInputStream fileInputStream1 = new FileInputStream(fileName1)){
                if (fileInputStream1.available() < 1000) throw new DownloadException();
            }
        }*/


    public static class DownloadException extends Exception {

    }
}
