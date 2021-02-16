package zh.codegym.task.task03.task0309;

/* 
5 个数字之和
*/

import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        BigDecimal cnt=new BigDecimal(0);
        for (int i=1;i<=5;i++){
            cnt=cnt.add(new BigDecimal(i));
            System.out.println(cnt);
        }
    }
}
