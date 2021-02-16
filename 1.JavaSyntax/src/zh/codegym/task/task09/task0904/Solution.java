package zh.codegym.task.task09.task0904;

/* 10 次调用的堆栈跟踪
编写代码来获得 10 次深度调用的堆栈。不要更改 main 方法。
Requirements:
1. 这一类应该有 10 个方法（除了 main 方法之外）。
2. 变量 stackTraceLength 必须最终等于 10。
3. 每个方法必须调用另一个方法。
4. 使用 Thread.currentThread().getStackTrace() 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return method4();
    }

    public static StackTraceElement[] method4() {
        return method5();
    }

    public static StackTraceElement[] method5() {
        return method6();
    }

    public static StackTraceElement[] method6() {
        return method7();
    }

    public static StackTraceElement[] method7() {
        return method8();
    }

    public static StackTraceElement[] method8() {
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
