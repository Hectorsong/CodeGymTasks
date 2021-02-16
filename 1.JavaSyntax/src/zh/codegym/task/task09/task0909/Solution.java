package zh.codegym.task.task09.task0909;

/* 
处理数组时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }


        //在此编写你的代码
    }
}
