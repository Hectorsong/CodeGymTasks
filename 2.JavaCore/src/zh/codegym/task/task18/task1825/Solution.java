package zh.codegym.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
构建文件
*/

public class Solution {
/*    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int countPartNumber = 0;
        while (true){
            String readString = bufferedReader.readLine();
            if (!readString.equals("结束")){
                try(FileReader fileReader = new FileReader(readString)){
                    while (fileReader.ready()){

                    }
                }
            }else break;
        }

    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
                return number1 - number2;
            }
        });
        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("结束")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }
        if (outputFile == null) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    /*  //大文件容易造成内存溢出
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);*/
                    byte[] arr = new byte[1024];
                    int len;
                    while ((len = fileInputStream.read(arr)) != -1){
                        fileOutputStream.write(arr, 0, len);
                        }
                    }
                }
            }
        }
    }


