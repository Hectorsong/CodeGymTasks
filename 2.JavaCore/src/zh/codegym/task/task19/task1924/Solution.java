package zh.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
替换数字
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "零");
        map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        map.put(5, "五");
        map.put(6, "六");
        map.put(7, "七");
        map.put(8, "八");
        map.put(9, "九");
        map.put(10, "十");
        map.put(11, "十一");
        map.put(12, "十二");
    }

    /*public static void main(String[] args) throws IOException {
        String fileName = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }
    }*/

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException ignored) {
        }

        String fileLine;
        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((fileLine = in.readLine()) != null) {
                fileContent.add(fileLine);
            }
        } catch (IOException ignored) {
        }

        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (int i = 0; i < splitedLine.length; i++) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    try {
                        int number = Integer.parseInt(splitedLine[i]);
                        if (entry.getKey().equals(number))
                            splitedLine[i] = entry.getValue();
                    } catch (NumberFormatException ignored) {
                    }
                }
            }

            StringBuilder sbLine = new StringBuilder();
            for (String word : splitedLine) {
                sbLine.append(word).append(" ");
            }

            System.out.println(sbLine.toString().trim());
        }
    }
}
