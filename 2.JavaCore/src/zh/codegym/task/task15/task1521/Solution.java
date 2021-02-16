package zh.codegym.task.task15.task1521;

import java.math.BigDecimal;

/* 
OOP：方法重载
*/

public class Solution {

    public static void main(String[] args) {
        // 块 2。
        // 调用 Object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // 块 3。
        // 调用 Number
        new Tree().info((new Integer("4")));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // 块 4。
        // 调用 String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }

}
