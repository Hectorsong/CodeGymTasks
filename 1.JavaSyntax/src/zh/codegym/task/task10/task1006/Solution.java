package zh.codegym.task.task10.task1006;

/* 任务 6 － 关于整数类型转换
删除不必要的运算符以获得正确的答案：结果：1000.0
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 char 变量 c。
4. main() 方法必须包含一个 short 变量 s。
5. main() 方法必须包含一个 int 变量 i。
6. main() 方法必须包含一个 float 变量 f。
7. main() 方法必须包含一个 double 变量 d。
8. main() 方法必须包含一个 double 变量 result。
9. 初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
10. 该程序应显示 "结果：1000.0"。
*/

public class Solution {

    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i =  150000;
        float f =  0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("结果: " + result);
    }
}