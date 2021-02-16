package zh.codegym.task.task06.task0602;

/* 僵尸猫和僵尸狗
在每个类（Cat 和 Dog）中编写 finalize 方法，该方法将显示有关被销毁的特定对象的文本。

Requirements:
1. Cat 类必须包含 void finalize 方法。
2. Dog 类必须包含 void finalize 方法。
3. Cat 和 Dog 类不得包含构造方法，或者必须包含不带参数的构造方法。
4. Cat 类的 finalize 方法应显示"一个 Cat 被销毁"。
5. Dog 类的 finalize 方法应显示"一个 Dog 被销毁"。
*/

public class Cat {
    public static void main(String[] args) {

    }

    //在此编写你的代码
    protected void finalize() throws Throwable{
        System.out.println("一个 Cat 被销毁");
    }
}

class Dog {
    //在此编写你的代码
    protected void finalize() throws Throwable{
        System.out.println("一个 Dog 被销毁");
    }
}
