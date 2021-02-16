package zh.codegym.task.task09.task0907;

/* 处理数字时发生异常
捕获执行以下代码时发生的异常：
int a = 42 / 0;
显示捕获的异常类型。
Requirements:
1. 程序应在屏幕上显示一条消息。
2. 程序必须有一个 try-catch 块。
3. 程序必须捕获特定类型的异常，而不是所有可能的异常（即不是 Exception）。
4. 显示的消息必须包含发生的异常类型。
5. 不要删除 main 方法中的现有代码。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try{
            int a = 42 / 0;
        }catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }

    }
}