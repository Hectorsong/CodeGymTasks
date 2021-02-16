package zh.codegym.task.task19.task1917;

/* 
你自己的 FileWriter
*/

import java.io.*;

public class FileConsoleWriter {

    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }
    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }
    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean append) throws IOException{
        this.fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        //len为偏移量，打印时endIndex为off+len
        System.out.println(new String(cbuf).substring(off, off + len));
    }
    //此处c为要写入的字符，所以打印时需要转为char
    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println((char) c);
    }
    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException{
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }
    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }
    public void close() throws IOException{
        fileWriter.close();
    }


    public static void main(String[] args) {

    }



}
