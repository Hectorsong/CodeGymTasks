package zh.codegym.task.task10.task1001;

/* 任务 1 － 关于整数类型转换
正确安排强制转换运算符以获得所需的结果：d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 int 变量 a。
4. main() 方法必须包含一个 int 变量 b。
5. main() 方法必须包含一个 byte 变量 c。
6. main() 方法必须包含一个 double 变量 f。
7. main() 方法必须包含一个 long 变量 d。
8. 初始化期间不要更改变量的初始值。你只能编辑（添加/删除/更改）强制转换运算符。
9. 该程序应显示一个大于 0 的数字。
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (int)1234.15;
        long d = (int) (a + f / c + b);
        System.out.println(d);
    }
}
