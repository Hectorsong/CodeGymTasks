package zh.codegym.task.task11.task1109;

/* 猫狗示例
将 Cat 和 Dog 类的所有内部变量设为 private。
另外，将所有方法设为 private，除了那些允许这两个类相互交互的方法。
Requirements:
1. Cat 类的变量必须为 private。
2. Dog 类的变量必须为 private。
3. Cat 类的方法必须为 private。
4. Dog 类的方法必须为 private。
5. 让 Cat 和 Dog 类相互交互的方法必须为 public。
*/
public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat("奥斯卡", 5);
        Dog dog = new Dog("流浪者", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {

    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {

    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}



