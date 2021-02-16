package zh.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* 
对字节排序
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
//        String fileName = args[0] + " " + args[1];
        Set<Integer> bytes = new TreeSet<>();
        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            while (fileInputStream.available() > 0){
                bytes.add(fileInputStream.read());
            }

        }
        for (Integer temp : bytes) {
            System.out.print(temp + " ");
        }
    }
}

class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
//        String fileName = reader.readLine();
        String fileName = args[0] + " " + args[1];
        try (FileInputStream stream = new FileInputStream(fileName)){
            while (stream.available() > 0) {
                list.add(stream.read());
            }
        }
        reader.close();
        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }
}
