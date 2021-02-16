package zh.codegym.task.task18.task1812;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException
    {
        //将数据放入字符串
        StringBuilder sb = new StringBuilder();
        sb.append("莉娜").append('\n');
        sb.append("奥丽雅").append('\n');
        sb.append("安雅").append('\n');
        String data = sb.toString();

        //将字符串包装在 ByteArrayInputStream 中
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //替换位置
        System.setIn(is);

        //调用一个不知道我们更改的普通方法
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
