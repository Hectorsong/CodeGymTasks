package zh.codegym.task.task12.task1212;

/* “修复代码”，第 1 部分
更正代码，让程序可以编译。
提示：
getChild 方法必须保持为 abstract。
Requirements:
1. Pet 类必须为 static。
2. Pet 类必须有两个方法。
3. getChild() 方法必须为 abstract。
4. Pet 类必须使用修饰符声明，以防止创建该类的对象。
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "我是一只小猫";
        }

        public abstract Pet getChild();
    }
}
