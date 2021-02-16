package zh.codegym.task.task13.task1326;

/* 
对文件中的偶数进行排序
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码
/*        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(br1.readLine()))){

        }
        while (fileReader.ready()){
            int i = Integer.parseInt(fileReader.readLine());
            if (i % 2 == 0){
                arrayList.add(i);
            }
        }

        Collections.sort(arrayList);
        for (Integer num : arrayList) System.out.println(num);*/

        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
        try {
            String line;
            int tmp;
            while ((line = reader.readLine()) != null){
                tmp = Integer.parseInt(line);
                if(tmp % 2 == 0){
                    arrayList.add(tmp);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Collections.sort(arrayList);
        for (Integer num : arrayList) System.out.println(num);

    }
}
