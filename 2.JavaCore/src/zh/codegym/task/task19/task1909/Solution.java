package zh.codegym.task.task19.task1909;

/* 
更改标点符号
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        bf.close();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            int c;
            while ((c = bufferedReader.read()) != -1){
                if ((char)c == '.') {
                    c = '!';
                }
                bufferedWriter.write(c);
            }
        }

    }
}
