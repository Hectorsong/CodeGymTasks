package zh.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
读取文件
*/

/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        bufferedReader.close();

        File file = new File(string);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fileInputStream));
        String s = br2.readLine();
        System.out.print(s);
//            System.out.print((char)fileInputStream.read());

        fileInputStream.close();



    }
}*/

public class Solution {
    public static void main(String[] args) {
        // 在此编写你的代码
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String path = br.readLine();
            br.close();

            File file = new File(path);
            InputStream fr=new FileInputStream(file);
            BufferedReader br2 = new BufferedReader(new InputStreamReader(fr));

            String s = null;
            while((s = br2.readLine()) != null){//br2为null值时，跳出循环
                System.out.println(s);
            }

            fr.close();
            br2.close();
        }catch(IOException e){

        }
    }
}
