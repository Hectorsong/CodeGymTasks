package zh.codegym.task.task12.task1215;

/* 猫不应该是抽象的！
让 Cat 和 Dog 类继承 Pet。
实现缺失的方法。
Cat 和 Dog 类不得为 abstract。
Requirements:
1. Pet 类必须为 abstract。
2. Dog 类不能为 abstract。
3. Cat 类不能为 abstract。
4. Dog 类必须实现 Pet 类的 abstract 方法。
5. Cat 类必须实现 Pet 类的 abstract 方法。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        @Override
        public String getName(){
            return "name";
        }
        @Override
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName(){
            return "name";
        }
        @Override
        public Pet getChild(){
            return new Cat();
        }
    }

}
