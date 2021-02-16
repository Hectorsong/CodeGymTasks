package zh.codegym.task.task18.task1821;

/* 
符号频率
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];
        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                aSCII[fileReader.read()]++;
            }
        }

        for (int i = 0; i < aSCII.length; i++ ) {
            if (aSCII[i] != 0){
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}
