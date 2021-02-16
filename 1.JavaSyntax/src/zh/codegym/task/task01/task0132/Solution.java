package zh.codegym.task.task01.task0132;

/* 
三位数的数字和
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //在此编写你的代码
        int length = String.valueOf(number).length();
        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int temp = number;
            array[i] = temp % 10;
            number = number / 10;
            sum = sum + array[i];
        }
        return sum;
    }
}