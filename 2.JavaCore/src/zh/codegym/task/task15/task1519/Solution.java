package zh.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
不同类型的不同方法
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals("exit"))
                break;
            try {
                int integer = Integer.parseInt(s);
                if (integer >= 128 || integer <= 0) {
                    print(integer);
                } else {
                    short shortNumber = (short) integer;
                    print(shortNumber);
                }
                continue;
            } catch (Exception e) {
                try {
                    double dubleNum = Double.parseDouble(s);
                    print(dubleNum);
                    continue;
                } catch (Exception ee) {
                    print(s);
                }
            }
        }
/*        String str = null;
        while (!(str = bufferedReader.readLine()).equals("exit")){
            try{
                if (str.contains(".")){
                    print(Double.parseDouble(str));
                }else if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128){
                    print(Short.parseShort(str));
                }else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128){
                    print(Integer.parseInt(str));
                }
*//*            while (true){
                str = bf.readLine();
                if (str.equals("exit")){
                    break;
                }else if (str.contains(".")){
                    print(Double.valueOf(str));
                }else if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128){
                    print(Short.valueOf(str));
                }else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128){
                    print(Integer.valueOf(str));
                }
            }*//*
            }catch (NumberFormatException e){
                print(str);
            }*/
        }


    public static void print(Double value) {
        System.out.println("这是一个 Double。Value: " + value);
    }

    public static void print(String value) {
        System.out.println("这是一个 String。Value: " + value);
    }

    public static void print(short value) {
        System.out.println("这是一个 short。Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("这是一个 Integer。Value: " + value);
    }
}
