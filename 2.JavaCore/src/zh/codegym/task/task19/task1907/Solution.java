package zh.codegym.task.task19.task1907;

/* 
字词计数
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        bf.close();

        StringBuilder sb = new StringBuilder();
        try(FileReader fileReader = new FileReader(fileName1)){
            int c;
            while ((c = fileReader.read()) != -1){
                sb.append((char) c);
            }
        }

        String replacedString = sb.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }
        System.out.println(counter);
//        System.out.println(getSubCount(replacedString, "world"));
    }

    public static int getSubCount(String str, String key){
        int count = 0;
        int index = 0;
        while ( (index = str.indexOf(key, index)) != -1){
            index = index + key.length();
            count++;
        }
        return count;
    }

}
