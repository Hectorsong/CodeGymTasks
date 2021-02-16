package zh.codegym.task.task05.task0525;

/* 整只鸭子还不够
使用 Duck  类作为模式，创建 Cat 和 Dog  类。你认为 Cat 和 Dog 类中的 toString 方法应返回什么？在 main 方法中，为每个类创建两个对象并在屏幕上显示它们。
Duck 对象已创建并显示在屏幕上。
Requirements:
1. 创建 Cat 类。
2. 创建 Dog 类。
3. Cat 类必须正确实现 toString 方法。
4. Dog 类必须正确实现 toString 方法。
5. 在 main 方法中，创建两个 Cat 对象。
6. 在 main 方法中，创建两个 Dog 对象。
7. 在屏幕上显示所有已创建的对象。
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
        //在此编写你的代码
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog {
        public String toString() { return "Dog"; }
    }

    //在此编写你的代码
}
