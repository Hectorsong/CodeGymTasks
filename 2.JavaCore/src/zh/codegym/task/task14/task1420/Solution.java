package zh.codegym.task.task14.task1420;

/* 
最大公约数 (GCD)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int numberOne = Integer.parseInt(bufferedReader.readLine());
            int numberTwo = Integer.parseInt(bufferedReader.readLine());
            if (numberOne <= 0 || numberTwo <= 0) throw new Exception();
            System.out.println(calculateGCD(numberOne, numberTwo));
        }catch (NumberFormatException e){
            throw e;
        }
        catch (Exception e){
            throw e;
        }
    }

    public static int calculateGCD(int numberOne, int numberTwo){
        int temp = 1;

        long startTime = System.currentTimeMillis();
        for (int i = 2; i <= (numberOne > numberTwo ? numberTwo : numberOne); i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                temp = i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");


        int temp2 = 1;
        long startTime2 = System.currentTimeMillis();
        while (numberOne != 0 && numberTwo != 0) {
            if (numberOne > numberTwo) numberOne %= numberTwo;
            else numberTwo %= numberOne;
        }
        temp2 = numberOne + numberTwo;
        long endTime2 = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime2 - startTime2) + "ms");
        return temp;
    }

}
