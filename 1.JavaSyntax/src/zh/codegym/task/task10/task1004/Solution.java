package zh.codegym.task.task10.task1004;

/* 任务 4 － 关于整数类型转换
添加一个类型转换以获得如下答案：nine = 9
short number = 9;
char zero = '0';
int nine = (zero + number);
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。你只能添加强制转换运算符。
3. main() 方法必须包含一个 short 变量 number。
4. main() 方法必须包含一个 char 变量 zero。
5. main() 方法必须包含一个 int 变量 nine。
6. 初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
7. 该程序应显示数字 9。
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero  + number);
        System.out.println((char)nine);
    }
}
