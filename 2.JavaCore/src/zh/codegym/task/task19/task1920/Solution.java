package zh.codegym.task.task19.task1920;

/* 
首富
*/

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String , Double> fileMap = new TreeMap<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String temp = fileReader.readLine();
                String[] tempArray = temp.split(" ");
                Double a = Double.parseDouble(tempArray[1]);
                Double b = fileMap.get(tempArray[0]);
                if ( !fileMap.containsKey(tempArray[0])) {
                    fileMap.put(tempArray[0] , a);
                } else {
                    fileMap.put(tempArray[0] , a + b);
                }
            }
        }

        /*for (String key : fileMap.keySet()) {
            System.out.println(key + " " + fileMap.get(key));
        }*/

        //防止有多个最大值的情况
        double maxSalary = fileMap.firstEntry().getValue();
        TreeSet<String> names = new TreeSet<>();
        for (Map.Entry<String , Double> value : fileMap.entrySet()) {
            double tempValue = value.getValue();
            if (maxSalary < tempValue) {
                maxSalary = tempValue;
                names.clear();
                names.add(value.getKey());
            } else if (maxSalary == tempValue) {
                names.add(value.getKey());
            }
        }

        for (String set : names) {
            System.out.println(set);
        }

    }
}
