package zh.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

/*    static{
        firstFileName = "C:\\Users\\Administrator\\Desktop\\fintech\\123.txt";
        secondFileName = "C:\\Users\\Administrator\\Desktop\\fintech\\234.txt";
    }*/

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName;
        private String fileContent = "";
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            return fileContent;
        }

        @Override
        public void run() {
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                while (reader.ready()){
                    if (fileContent != null){
                        fileContent += " " + reader.readLine();
                    }else {
                        fileContent = reader.readLine();
                    }
                }
                reader.close();
            } catch (FileNotFoundException e){

            } catch (IOException e){

            }
        }
    }
}
