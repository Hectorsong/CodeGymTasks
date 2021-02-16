package zh.codegym.task.task18.task1826;

/* 
加密
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String temp = args[0];
        if (!(args[0]=="-e")&&!(args[0]=="-d")) return;
        try(FileInputStream fileInputStream = new FileInputStream(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2]);){
            byte[] arr = new byte[1024];
            int len;
            if (temp == "-e"){
                while ((len = fileInputStream.read(arr)) != -1) {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (byte) (arr[i] + 32);
                    }
                    fileOutputStream.write(arr, 0, len);
                }
            }else{
                while ( (len = fileInputStream.read(arr)) != -1){
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (byte) (arr[i] - 32);
                    }
                    fileOutputStream.write(arr, 0, len);
                }
            }
        }
    }
}
