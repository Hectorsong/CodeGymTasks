package zh.codegym.task.task09.task0901;

/* 返回堆栈跟踪
写出相互调用的五种方法。
每个方法必须返回其堆栈跟踪。
Requirements:
1. 这一类应该有 5 个方法（除了 main 方法之外）。
2. 每个方法都应调用下一个方法：main 方法调用 method1，method1 调用 method2，依此类推。
3. 每个方法必须返回其堆栈跟踪。
4. 要获取堆栈跟踪，请使用 Thread.currentThread().getStackTrace()。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }
}
