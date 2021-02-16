package zh.codegym.task.task09.task0928;
import java.io.*;
/* 代码将无法编译…
任务：程序读取两个文件名。它将第一个文件复制到第二个文件名指定的位置。
Requirements:
1. 程序必须读取文件名。
2. 不要更改 getInputStream 方法。
3. 不要更改 getOutputStream 方法。
4. 程序必须将第一个文件的内容复制到第二个文件。
5. 程序应显示复制的字节数。
6. main 方法应调用 getInputStream 方法。
7. main 方法应调用 getOutputStream 方法
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();//输入被复制文本名称
        String destinationFileName = reader.readLine();//输入目的文本名称
        InputStream fileInputStream = getInputStream(sourceFileName);//读取输入文本
        OutputStream fileOutputStream = getOutputStream(destinationFileName);//输出目的文本

        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("已复制的字节数：" + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
