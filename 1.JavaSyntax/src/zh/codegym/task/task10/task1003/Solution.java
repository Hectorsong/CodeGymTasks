package zh.codegym.task.task10.task1003;

/* 任务 3 － 关于整数类型转换
添加一个类型转换以获得如下答案：b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 float 变量 f。
4. main() 方法必须包含一个 int 变量 i。
5. main() 方法必须包含一个 int 变量 b。
6. 初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
7. 程序应显示数字 0。
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
}
