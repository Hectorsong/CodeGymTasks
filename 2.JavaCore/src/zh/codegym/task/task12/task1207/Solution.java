package zh.codegym.task.task12.task1207;

/* int 和 Integer
编写以下两种方法：print(int) 和 print(Integer)。
在 main 方法中，编写调用两种方法的代码：
Requirements:
1. Solution 类必须包含 static main() 方法。
2. Solution 类必须包含带 int 参数的 static void print() 方法。
3. Solution 类必须包含带 Integer 参数的 static void print() 方法。
4. main() 方法必须调用带 int 参数的 print() 方法。
5. main() 方法必须调用带 Integer 参数的 print() 方法。
*/

public class Solution {
    public static void main(String[] args) {
        print(5);
        print(new Integer(5));
    }

    public static void print(int number){
    }

    public static void print(Integer string){
    }
}
