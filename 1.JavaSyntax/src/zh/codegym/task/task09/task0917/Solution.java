package zh.codegym.task.task09.task0917;

/* 捕获未检查异常
在 handleExceptions 方法中，处理所有未检查异常。
你需要使用 printStack 方法来显示所发生的异常的堆栈跟踪。
你只能使用一个 try-catch 块。
Requirements:
1. handleExceptions 方法必须调用 method1。
2. handleExceptions 方法必须调用 method2。
3. handleExceptions 方法必须调用 method3。
4. handleExceptions 方法只能使用一个 try-catch 块。
5. handleExceptions 方法应捕获所有未检查的异常，并使用 printStack 方法显示所发生异常的堆栈跟踪。
6. 该程序应显示文本。
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj){
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException e)
        {
            printStack(e);
        } catch (IndexOutOfBoundsException e)
        {
            printStack(e);
        } catch (NumberFormatException e)
        {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

