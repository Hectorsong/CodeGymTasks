package zh.codegym.task.task05.task0527;

/* 汤姆和杰瑞
创建 Dog、Cat 和 Mouse 类。
向每个类添加所选的三个字段。
为动画片《汤姆和杰瑞》中的角色创建对象。
你会想起来很多。
例如：
Mouse jerryMouse = new Mouse("杰瑞", 5, 2),
其中 5 是身高（以英寸表示），
2 是尾巴的长度（以英寸表示）。
Requirements:
1. 创建 Dog 类。
2. 创建 Cat 类。
3. Dog 类必须包含三个变量。
4. Cat 类必须包含三个变量。
5. 必须至少创建一个 Mouse 对象。
6. 必须至少创建一个 Dog 对象。
7. 必须至少创建一个 Cat 对象。
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("杰瑞", 12, 5);
        Dog speikeDog = new Dog("斯派克", 12, 5);
        Cat tomCat = new Cat("汤姆", 12, 5);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
