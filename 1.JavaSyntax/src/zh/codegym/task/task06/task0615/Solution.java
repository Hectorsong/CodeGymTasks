package zh.codegym.task.task06.task0615;

/* 风水和 static
移动一个 static 修饰符以使示例编译。
Requirements:
1. 不要更改 main 方法。
2. 将 static 修饰符添加到所需位置。
3. 删除额外的 static 修饰符。
4. 程序只能包含 2 个 static 修饰符。
*/

public class Solution {

    public static int A = 5;
    public int B = 2;
    public  int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}
