package zh.codegym.task.task18.task1812;

import java.io.*;

/* 
扩展 AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream amigoOutputStream;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //构造方法
    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("你确实要关闭流吗？是/否");
        String inputString = bufferedReader.readLine();
        if ("是".equals(inputString)){
            amigoOutputStream.close();
        }
    }
}

