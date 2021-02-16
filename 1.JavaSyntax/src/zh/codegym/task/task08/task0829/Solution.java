package zh.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
软件更新
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 地址列表
        List<String> addresses = new ArrayList<>();
        List<String> familys = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            addresses.add(city);
            String family = reader.readLine();
            if (family.isEmpty()) break;
            familys.add(family);
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < addresses.size(); i++) {
            map.put(addresses.get(i), familys.get(i));
        }
/*
        Iterator<String> iterator = map.keySet().iterator();*/
        String add = reader.readLine();
        for(String key : map.keySet()){
            while (key.equals(add)){
                String value = map.get(add);
                System.out.println(value);
                break;
            }
        }
/*        while (iterator.hasNext()){
            if (add.equals(iterator.next())){
                System.out.println(map.entrySet());
            }
        }*/

    }
}
