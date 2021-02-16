package zh.codegym.task.task06.task0616;

/* 最小数量的 static
放入使代码开始工作和程序成功完成所需的最小数量的 static 修饰符。
Requirements:
1. 不要更改方法实现或访问修饰符。
2. 将 static 修饰符添加到所需位置。
3. 程序只能包含 4 个 static 修饰符。
4. 程序应在屏幕上显示文本。
*/

public class Solution {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}
