package zh.codegym.task.task10.task1005;

/* 任务 5 － 关于整数类型转换
正确安排强制转换运算符以获得如下答案：c = 256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 int 变量 a。
4. main() 方法必须包含一个 int 变量 b。
5. main() 方法必须包含一个 short 变量 c。
6. 初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
7. 该程序应显示数字 256。
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}