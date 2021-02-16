package zh.codegym.task.task19.task1925;

/* 
长字词
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    /*public static void main(String[] args) throws IOException {
        try(BufferedReader file1Reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter file2Writer = new BufferedWriter(new FileWriter(args[1]))
        ) {
            String fileStr;
            while ( (fileStr = file1Reader.readLine()) != null) {
                String[] words = fileStr.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 6) {
                        if (i != 0) {
                            file2Writer.write(",");
                        } file2Writer.write(words[i]);

                    }
                }
            }
        }
    }*/

    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<String>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) {
            /* NOP */
        }

        StringBuffer sbLine = new StringBuffer();
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)

                    sbLine.append(word).append(" ");
            }
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
