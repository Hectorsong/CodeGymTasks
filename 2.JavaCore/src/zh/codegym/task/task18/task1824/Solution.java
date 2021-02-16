package zh.codegym.task.task18.task1824;

/* 
文件和异常
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = bufferedReader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            }catch (FileNotFoundException e){
                System.out.println(fileName);
                e.printStackTrace();
                break;
            }
        }

    }
}
