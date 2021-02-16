package zh.codegym.task.task12.task1203;

/* 物归原主
重写 Cat 和 Dog 类中的 getChild 方法，以便猫生猫，狗生狗。
Requirements:
1. Cat 类必须继承 Pet 类。
2. Dog 类必须继承 Pet 类。
3. Cat 类必须重写 getChild() 方法，以便猫生猫。
4. Dog 类必须重写 getChild() 方法，以便狗生狗。
5. main() 方法必须在 Cat 对象上调用 getChild() 方法。
6. main() 方法必须在 Dog 对象上调用 getChild() 方法。
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Cat getChild(){return new Cat();}
    }

    public static class Dog extends Pet {
        public Dog getChild(){return new Dog();}
    }
}
