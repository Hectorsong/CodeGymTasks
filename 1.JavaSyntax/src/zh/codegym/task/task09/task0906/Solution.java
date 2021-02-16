package zh.codegym.task.task09.task0906;

/* 记录堆栈跟踪
实施日志方法。
日志方法应显示调用它的类和方法的名称，以及传递的消息。
使用冒号和空间分隔类名、方法名和消息。
示例输出：
com.codegym.task.task09.task0906.Solution: main:在 main 方法中
Requirements:
1. 日志方法必须在屏幕上显示一条消息。
2. 显示的消息必须包含调用日志方法的方法所属的类名称。
3. 显示的消息必须包含调用日志方法的方法的名称。
4. 显示的消息必须包含传递的消息。
5. 输出必须与任务中的示例匹配。
*/

public class Solution {
    public static void main(String[] args) {
        log("在 main 方法中");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + s);
/*
        String a =stackTraceElements[2].getClassName();
        String b =stackTraceElements[2].getMethodName();
        System.out.printf("%s: %s: %s",a,b,s);
*/
    }
}
