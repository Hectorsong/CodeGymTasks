package zh.codegym.task.task12.task1211;

/* 抽象宠物类
让 Pet 类设为 abstract。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. Pet 类必须为 static。
3. Pet 类必须为 abstract。
4. Pet 类中只能包含一个名为 getName() 的方法。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "我是一只小猫";
        }
    }
}
