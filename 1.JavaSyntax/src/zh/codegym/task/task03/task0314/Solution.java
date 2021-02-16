package zh.codegym.task.task03.task0314;

/* 
乘法表
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = (i + 1) * (j + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
