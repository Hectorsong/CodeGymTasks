package zh.codegym.task.task03.task0308;

/* 
10 个数字的乘积
*/

import java.math.BigDecimal;


public class Solution {
    public static void main(String[] args) {
        System.out.println(jiecheng(10));
    }
    public static BigDecimal jiecheng(int i){
        if (i == 1) {
            return new BigDecimal(i);
        }else {
            return jiecheng(i -1).multiply(new BigDecimal(i));
        }
    }
}
