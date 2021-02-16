package zh.codegym.task.task19.task1923;

/* 
包含数字的字词
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader file1Reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter file2Writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (file1Reader.ready()) {
                String tempStr = file1Reader.readLine();
                String[] tempArray = tempStr.split(" ");
                for (String str: tempArray) {
                    if (str.matches(".+[0-9].+")){
                        file2Writer.write(str + " ");
                    }
                }

            }
        }

    }
}
