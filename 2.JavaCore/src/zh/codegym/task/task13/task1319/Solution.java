package zh.codegym.task.task13.task1319;

import javax.imageio.IIOException;
import java.io.*;

/* 
从控制台写入文件
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br1.readLine();
/*        File file = new File(fileName);
        if (!file.exists()){
            file.createNewFile();
        }*/
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while (true) {
            String str = br1.readLine();
            writer.write(str);
            if (str.equals("exit")) break;
            writer.newLine();
        }
        writer.close();


/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
            while (true)
            {
                String text = reader.readLine();
                writer.write(text);
                if (text.equals("exit")) break;
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
