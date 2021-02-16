package zh.codegym.task.task06.task0612;

/* 计算器
创建 Calculator 类，其中包含 5 个 static 方法：
int plus(int a, int b) - 返回 a 和 b 的总和
int minus(int a, int b) - 返回 a 和 b 之间的差
int multiply(int a, int b) - 返回 a 和 b 的乘积
double divide(int a, int b) - 返回 a 除以 b 的结果
double percent(int a, int b) - 返回数字 a 的 b%
Requirements:
1. plus 方法必须返回 a 和 b 的总和。
2. minus 方法必须返回 a 和 b 之间的差。
3. multiply 方法必须返回 a 和 b 的乘积。
4. divide 方法必须返回 a 除以 b 的结果。
5. percent 方法必须返回数字 a 的 b%。
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a/(double) b;
    }

    public static double percent(int a, int b) {
//        return ((double) a/(double) b * 100) ;
        return ((double)b / 100) * a ;

    }

    public static void main(String[] args) {
        System.out.println(divide(3, 9));
        System.out.println(percent(3, 9));
    }
}