package zh.codegym.task.task03.task0303;

/* 
货币兑换
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(123, 456));
        System.out.println(convertEurToUsd(23, 456));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //在此编写你的代码
        return eur * exchangeRate;
    }
}
