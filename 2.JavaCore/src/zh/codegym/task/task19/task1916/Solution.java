package zh.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
跟踪更改
*/

public class Solution {

    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bf.readLine();
            fileName2 = bf.readLine();
        }

        List<String> oldFileLines = readFileLines(fileName1);
        List<String> newFileLines = readFileLines(fileName2);

        int oldFileLine = 0;
        int newFileLine = 0;

        while ((oldFileLine < oldFileLines.size()) && newFileLine < newFileLines.size()) {
            if ( (oldFileLines.get(oldFileLine)).equals(newFileLines.get(newFileLine))) {
                lines.add(new LineItem(Type.SAME , oldFileLines.get(oldFileLine)));
                oldFileLine++;
                newFileLine++;
            } else if ((newFileLine + 1 < newFileLines.size()) && (oldFileLines.get(oldFileLine)).equals(newFileLines.get(newFileLine + 1))) {
                lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLine)));
                newFileLine++;
            } else if ((oldFileLine + 1 < oldFileLines.size()) && (newFileLines.get(newFileLine)).equals(oldFileLines.get(oldFileLine + 1))) {
                lines.add(new LineItem(Type.REMOVED, oldFileLines.get(oldFileLine)));
                oldFileLine++;
            }
        }
        for (LineItem temp: lines) {
            System.out.println(temp.type + " " + temp.line);
        }
        System.out.println("---------------------------------------");


        while (oldFileLine < oldFileLines.size()) {
            lines.add(new LineItem(Type.REMOVED, oldFileLines.get(oldFileLine)));
            oldFileLine++;
        }
        for (LineItem temp: lines) {
            System.out.println(temp.type + " " + temp.line);
        }
        System.out.println("---------------------------------------");


        while (newFileLine < newFileLines.size()) {
            lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLine)));
            newFileLine++;
        }
        for (LineItem temp: lines) {
            System.out.println(temp.type + " " + temp.line);
        }
    }

    public static List<String> readFileLines(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> fileLines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            fileLines.add(line);
        }
        bufferedReader.close();
        return fileLines;
    }

    public static enum Type {
        ADDED,        // 添加了新行
        REMOVED,      // 删除了行
        SAME          // 无更改
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
