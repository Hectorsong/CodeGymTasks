package zh.codegym.task.task12.task1202;

/* 鲸鱼，母牛的后代
重写 Whale 类中的 getName 方法，从而使程序不在屏幕上显示任何内容。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. Whale 类必须继承 Cow 类。
3. Whale 类必须重写 getName() 方法。
4. main() 方法必须调用 Cow 对象的 getName() 方法。
5. 实现 Whale 类的 getName() 方法，以使程序在屏幕上不显示任何内容。
6. main() 方法应显示调用 getName() 方法的结果。
*/

public class Solution {

    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "我是一头牛";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}
