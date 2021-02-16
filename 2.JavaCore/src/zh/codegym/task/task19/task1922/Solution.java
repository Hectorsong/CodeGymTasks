package zh.codegym.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
搜索正确的行
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("文件");
        words.add("查看");
        words.add("在");
    }

    public static void main(String[] args) throws IOException {
        /*
        1 读文件名
        2 读文件
        3 List保存所有单词
        4 遍历
        * */
        String fileName = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }

        List<String> wordsList = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String tempStr = fileReader.readLine();
                String[] tempArray = tempStr.split(" ");

                int wordCount = 0;
                for (String str: tempArray) {
                    if (words.contains(str)){
                        wordCount++;
                    }
                }
                if (wordCount == 2) {
                    System.out.println(tempStr);
                }
            }
        } catch (Exception ignored){

        }
    }
}
