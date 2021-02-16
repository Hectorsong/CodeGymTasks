package zh.codegym.task.task09.task0912;

/* 
处理数字时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException");
        }


        //在此编写你的代码
    }
}
