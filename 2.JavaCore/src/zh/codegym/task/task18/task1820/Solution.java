package zh.codegym.task.task18.task1820;

/* 
数字四舍五入
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2))){
            while (bufferedReader.ready()){
                String[] spittedLine = bufferedReader.readLine().split(" ");
                for (String numberInString : spittedLine) {
                    double number = Double.parseDouble(numberInString);
                    long roundedNumber = Math.round(number);
                    printWriter.write(roundedNumber + " ");
                }
            }

        }
    }
}
