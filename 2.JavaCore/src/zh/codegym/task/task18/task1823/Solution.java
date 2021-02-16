package zh.codegym.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/* 
线程和字节
*/
public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readThreadName;
//        while ((readFileName = bufferedReader.readLine()) != null && readFileName.equals("退出"))
        while (!(readThreadName = bufferedReader.readLine()).equals("退出"))
        {
            new ReadThread(readThreadName).start();
        }
    }

    public static class ReadThread extends Thread {
        private String threadName;
        public ReadThread(String threadName) {
            this.threadName = threadName;
        }
        @Override
        public void run() {
            byte[] bytesArray = new byte[256];
            try(FileInputStream fileInputStream = new FileInputStream(threadName)){
                while (fileInputStream.available() > 0) {
                    int bytes =fileInputStream.read();
                    bytesArray[bytes]++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxCount = 0;
            int maxCountBytes = 0;
            for (int i = 0; i < bytesArray.length; i++) {
                if (bytesArray[i] > maxCount){
                    maxCount = bytesArray[i];
                    maxCountBytes = i;
                }
            }
            resultMap.put(threadName, maxCountBytes);
        }
    }
}
