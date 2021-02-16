package zh.codegym.task.task19.task1919;

/* 
计算薪水
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String , Double> fileMap = new TreeMap<>();
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

//        fileMap = sortByValue(fileMap);

        for (String key : fileMap.keySet()) {
            System.out.println(key + " " + fileMap.get(key));
        }

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        Map<K, V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();
        st.sorted(Comparator.comparing(e -> e.getValue())).forEach(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }
}
