package zh.codegym.task.task18.task1817;
/* 
空格
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        int n1 = 0;
        int n2 = 0;
        try(FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                int readerChar = fileReader.read();
                n1++;
                if(readerChar == (int) ' ')  n2++;
            }
        }
        if(n1 != 0) {
            double result = (double) n2 / n1 * 100;
            System.out.printf("%.2f", result);
        }
    }
}
