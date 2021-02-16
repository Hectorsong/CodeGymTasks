package zh.codegym.task.task01.task0134;

/* 
将池子注满水
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //在此编写你的代码
        return a * b * c * 1000;
    }
}