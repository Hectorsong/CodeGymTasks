package zh.codegym.task.task11.task1106;

/* 隐蔽包装的猫
将 Cat 类的所有内部变量设为 private。
Requirements:
1. Cat 类的变量 name 必须为 private。
2. Cat 类的变量 age 必须为 private。
3. Cat 类的变量 weight 必须为 private。
4. Cat 类中必须有三个变量。
5. Cat 类中的所有变量必须为 private。
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

