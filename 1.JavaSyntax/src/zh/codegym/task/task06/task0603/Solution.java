package zh.codegym.task.task06.task0603;

/* Cat 和 Dog 对象：各有 50000 个对象
在循环中分别创建 50000 个 Cat 对象和 Dog 对象。
（Java 机器应开始销毁未使用的对象，并且 finalize 方法将至少被调用一次）。
Requirements:
1. Cat 类必须包含 void finalize 方法。
2. Dog 类必须包含 void finalize 方法。
3. Cat 类的 finalize 方法应显示"一个 Cat 被销毁"。
4. Dog 类的 finalize 方法应显示"一个 Dog 被销毁"。
5. main 方法必须创建 50000 个 Cat 对象和 50000 个 Dog 对象。
*/

import java.util.concurrent.CompletionStage;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0 ; i < 50000 ; i++){
            Cat cat = new Cat();
            Dog dog = new Dog();
        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("一个 Cat 被销毁");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("一个 Dog 被销毁");
    }
}
