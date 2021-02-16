package zh.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
走向全国
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 1; i <= s.length(); i++) {
//            list.add(s.substring(i-1,i));
//        }
//        for (int i = 1; i <= list.size(); i++) {
//            String temp = list.get(i-1);
//            if (" ".equals(temp) && i != list.size())
//                list.get(i).toUpperCase();
//        }
        //在此编写你的代码
//        String str="if you miss the tran i an on";
        String strArr[] = str.split(" ");
        String resultArr[] = new String[strArr.length];
        String regex = ".*[a-zA-z].*";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != "" && strArr[i].matches(regex)){
                str = strArr[i].substring(0, 1);
                resultArr[i] = strArr[i].replaceFirst(str, str.toUpperCase());
            }
            else resultArr[i] = strArr[i];
        }
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]+" ");
        }
    }
}