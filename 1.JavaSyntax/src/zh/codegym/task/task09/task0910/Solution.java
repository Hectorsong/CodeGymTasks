package zh.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
使用列表集合时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException");
        }


        //在此编写你的代码
    }
}