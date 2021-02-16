package zh.codegym.task.task19.task1910;

/* 
标点符号
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName ;
        String outputFileName ;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        } 

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                if (!String.valueOf((char) c).replaceAll("\\p{P}", "").equals("")  ){
                    bufferedWriter.write(c);
                }
            }
        }
    }
}
