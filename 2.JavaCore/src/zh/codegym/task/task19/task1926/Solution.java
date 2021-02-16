package zh.codegym.task.task19.task1926;

/* 
镜像图像
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }

        List<String> fileList = new ArrayList<>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String temp;
            while ( (temp = fileReader.readLine()) != null) {
                temp = new StringBuilder(temp).reverse().toString();
                fileList.add(temp);
            }
        }
        for (int i = 0; i < fileList.size(); i++) {
            System.out.print(fileList.get(i));
            System.out.println();
        }
    }
    //更好的写法
    /*public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileIn.ready()) {
                String line = fileIn.readLine();
                System.out.println(new StringBuffer(line).reverse().toString());
            }
        } catch (IOException ignore) {
            *//* NOP *//*
        }
    }*/
}
