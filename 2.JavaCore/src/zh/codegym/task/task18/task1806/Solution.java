package zh.codegym.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
修复错误
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // 创建流以将字节写入文件
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {
            // 一次读取整个文件
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
