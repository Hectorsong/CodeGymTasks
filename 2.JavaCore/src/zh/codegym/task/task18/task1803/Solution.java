package zh.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
使用最频繁的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
//        String fileName = args[0] + " " + args[1];
        int[] byteArray = new int[256];
        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            while (fileInputStream.available() > 0){
                byteArray[fileInputStream.read()] += 1;
            }
        }
        int maxAcount = 0;
        for (int byteCount : byteArray ) {
            if (byteCount > maxAcount){
                maxAcount = byteCount;
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == maxAcount) resultList.add(i);
        }

        for (Integer resultItem : resultList) {
            System.out.print(resultItem + " ");
//            System.out.print(Character.highSurrogate(resultItem) + " ");
            //文件输出最多的字节为, 换行符 LF ASICII码为10, 回车符 CR ASICII码为13
        }
    }
}
