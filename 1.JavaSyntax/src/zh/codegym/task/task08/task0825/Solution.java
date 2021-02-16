package zh.codegym.task.task08.task0825;

/* 混乱的修饰符
移动一个 static 修饰符以使示例编译。
Requirements:
1. Solution 类必须包含名为 A 的变量。
2. Solution 类必须包含名为 B 的变量。
3. Solution 类必须包含名为 C 的变量。
4. Solution 类必须包含名为 D 的变量。
5. Solution 类只能包含三个方法。
6. 该类必须包含 4 个 static 修饰符（变量和方法）。
*/

public class Solution {
    public static int A = 5;
    public static int B = 2;

    public  int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public  int getValue() {
        return D;
    }

    public  int getValue2() {
        return C;
    }
}

