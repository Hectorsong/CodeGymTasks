package zh.codegym.task.task09.task0903;

/* 调用我的对象是谁？
写出相互调用的五种方法。
每个方法都应返回调用它的代码的行号。
使用 element.getLineNumber() 方法。
Requirements:
1. 这一类应该有 5 个方法（除了 main 方法之外）。
2. 每个方法都应调用下一个方法：main 方法调用 method1，method1 调用 method2，依此类推。
3. 每个方法都应返回调用它的代码的行号。
4. 要获取行号，请使用 StackTraceElement 类的 getLineNumber 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }
}
