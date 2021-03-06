package zh.codegym.task.task10.task1007;

/* 任务 7 － 关于整数类型转换
删除不必要的运算符，以获得正确的答案：1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;
Requirements:
1. 程序应在屏幕上显示文本。
2. 不要更改屏幕输出命令。
3. main() 方法必须包含一个 long 变量 l。
4. main() 方法必须包含一个 int 变量 x。
5. main() 方法必须包含一个 double 变量 m。
6. main() 方法必须包含一个 float 变量 f。
7. 初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
8. 该程序应显示 1234567。
*/

public class Solution {
    public static void main(String[] args) {
        long l =  1234_564_890L;//1234564890
        int x =  0b1000_1100_1010;//2250
        double m = (byte) 110_987_654_6299.123_34;//-1.0
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}