package zh.codegym.task.task18.task1822;

/* 
查找文件中的数据
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        String str;
        try(BufferedReader bufferedFileReader1 = new BufferedReader(new FileReader(fileName))){
            while ( (str=bufferedFileReader1.readLine()) != null){
                if(str.startsWith(args[0] + " ")){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
