package zh.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
事务性
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf1.readLine();
        String fileName2 = bf1.readLine();
        String tempInput;
        BufferedReader bf2 = new BufferedReader(new FileReader(fileName1));
        BufferedReader bf3 = new BufferedReader(new FileReader(fileName2));
        while ((tempInput = bf2.readLine()) != null) {
            allLines.add(tempInput);
        }
        while ((tempInput = bf3.readLine()) != null) {
            linesForRemoval.add(tempInput);
        }
        bf1.close();
        bf2.close();
        bf3.close();
        new Solution().joinData();
    }


    public void joinData() throws CorruptedDataException, IOException{
        if (allLines.containsAll(linesForRemoval)){
            allLines.removeAll(linesForRemoval);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
