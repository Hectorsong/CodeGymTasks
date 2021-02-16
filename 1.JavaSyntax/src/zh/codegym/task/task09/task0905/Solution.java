package zh.codegym.task.task09.task0905;

/* 在堆栈跟踪的蓝色深度中…
写出返回堆栈跟踪深度（即堆栈跟踪中的方法数量）的方法。
该方法应在屏幕上显示相同的数字。
Requirements:
1. getStackTraceDepth 方法必须返回其堆栈跟踪的深度。
2. getStackTraceDepth 方法应显示其堆栈跟踪的深度。
3. 使用 Thread.currentThread().getStackTrace()。
4. main 方法必须调用 getStackTraceDepth 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements.length);
        return stackTraceElements.length;
    }
}

