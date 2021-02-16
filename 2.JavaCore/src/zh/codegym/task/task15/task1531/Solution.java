package zh.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
阶乘
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
//        BigInteger input1 = BigInteger.valueOf(Long.parseLong(reader.readLine()));
        reader.close();

        System.out.println(factorial(input));
//        System.out.println(factorial(input1));
    }

//    BigInteger bigInteger;
//
//    public static BigInteger factorial(BigInteger n){
//        if(n.equals("1")){
//            return BigInteger.valueOf(1);
//        }
//        else{
//            BigInteger temp = n.add(BigInteger.valueOf(-1));
//            return n.multiply(factorial(temp));
//        }
//    }
//
//    public static int factorial(int n){
//        if(n == 1){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }


    public static String factorial(int n) {
        BigInteger a= BigInteger.valueOf(1);
        if(n<0){
            return "0";
        }else {
            if(n<=150){
                for (int i = 1; i <= n; ++i) {
                    a = a.multiply(BigInteger.valueOf(i));// a *= i;
                }
            }
        }
        return a.toString();}
}
