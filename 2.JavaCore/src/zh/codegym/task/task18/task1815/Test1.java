package zh.codegym.task.task18.task1815;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append("莉娜").append('\n');
        sb.append("奥丽雅").append('\n');
        sb.append("安雅").append('\n');
        String data = sb.toString();

        InputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
        readAndPrintLine();
        /*
        System.setIn() 是文中重点
        可以把System.in 实例换为其他实例,文中替换为new ByteArrayInputStream(data.getBytes()).
        ByteArrayInputStream作用是从byte[]数组读取字节
        * */
    }

    public static void readAndPrintLine() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        while (true){
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        inputStreamReader.close();


    }
}
