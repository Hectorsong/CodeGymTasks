package zh.codegym.task.task19.task1908;

/* 
挑选数字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        bf.close();

        StringBuilder sb = new StringBuilder();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char)c);
            }
            String replacedString = sb.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            for (String x: replacedString.split(" ")) {
                /*for (Byte byteTemp: x.getBytes()) {
                    if (byteTemp < 64 || byteTemp > 73){
                        return;
                    }
                }*/
                try{
                    int i = Integer.parseInt(x);
                    fileWriter.write(x + " ");
                }catch (Exception ignore){

                }
            }


        }
    }
}
