package zh.codegym.task.task09.task0902;

/* 重访堆栈跟踪
写出相互调用的五种方法。
每个方法都应返回调用它的方法的名称。使用堆栈跟踪获取此信息。
Requirements:
1. 这一类应该有 5 个方法（除了 main 方法之外）。
2. 每个方法都应调用下一个方法：main 方法调用 method1，method1 调用 method2，依此类推。
3. 每个方法必须返回调用它的方法的名称。
4. 要获取调用方法的名称，请使用 getMethodName 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println("调用method1结束");
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println("调用method2结束");
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        System.out.println("调用method3结束");
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println("调用method4结束");
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println("调用method5结束");
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }
}
