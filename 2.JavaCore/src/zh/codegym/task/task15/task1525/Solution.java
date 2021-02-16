package zh.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
static 块中的文件
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String str = null;
            while(br.ready()){
                str = br.readLine();
                lines.add(str);
            }
            br.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
