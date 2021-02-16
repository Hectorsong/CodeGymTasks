package zh.codegym.task.task19.task1906;

/* 
偶数字符
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        bf.close();
        //Writer类中有个2k的小缓冲区，如果不关流，就会将内容写到缓冲区中。
        //关流会将缓冲区内容刷新，再关闭。
        try(FileReader fileReader = new FileReader(fileName1);
            FileWriter fileWriter = new FileWriter(fileName2)){
            int c;
            int i = 0;
            while ( (c = fileReader.read()) != -1){
//                System.out.print((char)c);
                i++;
                if ( i % 2 == 0 ) fileWriter.write((char)c);
            }
        }

        /*String fileName1 = "123.txt";
        String fileName2 = "1234.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        try (FileReader fileReader = new FileReader(fileName1)) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            for (int i = 1; i < list.size(); i = i + 2) {
                fileWriter.write((byte) (int) list.get(i));
            }
        }*/

    }
}
