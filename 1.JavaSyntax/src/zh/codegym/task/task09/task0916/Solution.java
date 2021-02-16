package zh.codegym.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 捕获已检查异常
在 handleExceptions 方法中，处理所有已检查异常。
你应显示所发生的已检查异常。
你只能使用一个 try-catch 块。
Requirements:
1. handleExceptions 方法必须调用 method1。
2. handleExceptions 方法必须调用 method2。
3. handleExceptions 方法必须调用 method3。
4. handleExceptions 方法只能使用一个 try-catch 块。
5. handleExceptions 方法应捕获并显示所有发生的异常。
6. 该程序应显示文本。
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) /*throws RemoteException*/ {
        try {
            obj.method3();
            obj.method1();
            obj.method2();
        } catch (RemoteException e)
        {
            System.out.println("RemoteException");
//            throw new RemoteException(e.getMessage());
        } catch (IOException e)
        {
            System.out.println("IOException");
        } catch (NoSuchFieldException e)
        {
            System.out.println("NoSuchFieldException");
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
