package zh.codegym.task.task10.task1008;

/* 正确答案：d = 2.941
添加一个类型转换以获得如下答案：d = 2.941
示例输出：
2.9411764705882355
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 int 变量 a。
4. main() 方法必须包含一个 int 变量 b。
5. main() 方法必须包含一个 double 变量 d。
6. 初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
7. 程序应显示数字 2.9411764705882355。
*/

public class Solution {
/*    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d =  (a) / b;
        System.out.println( (float) (d));
    }*/
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}
