package zh.codegym.task.task09.task0925;

/* 错位的 static 修饰符
重新整理 static 修饰符，这个示例程序才能编译。
Requirements:
1. 该类必须包含变量 A。
2. 该类必须包含变量 B。
3. 该类必须包含变量 C。
4. 不要更改 main 方法。
5. 不要更改 getA 方法。
6. 该类必须包含 3 个 static 字段。
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
