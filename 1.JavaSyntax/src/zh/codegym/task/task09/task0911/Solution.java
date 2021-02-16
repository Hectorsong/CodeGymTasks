package zh.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
处理映射集合时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }


        //在此编写你的代码
    }
}
