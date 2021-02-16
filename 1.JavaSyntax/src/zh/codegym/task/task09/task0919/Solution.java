package zh.codegym.task.task09.task0919;

/* 除零
创建一个 public static void DivideByZero 方法，该方法将任意数字除零，并显示除法结果。
将 divideByZero 方法调用封装在 try-catch 块中。使用 exception.printStackTrace() 方法显示异常堆栈跟踪。
Requirements:
1. 该类必须包含 public static void divideByZero 方法。
2. divideByZero 方法必须包含一个除零运算。
3. divideByZero 方法应调用 System.out.println 或 System.out.print。
4. main 方法必须有一个 try-catch 块。
5. main 方法应捕获 divideByZero 方法抛出的任何异常。
6. 并非捕获 divideByZero 方法抛出的所有异常。
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Other exception");
        }
    }


    public static void divideByZero(){
        int i = 8/0;
        System.out.println(i);
    }
}
