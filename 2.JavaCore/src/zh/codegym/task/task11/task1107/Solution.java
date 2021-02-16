package zh.codegym.task.task11.task1107;

/* 我们的猫太公开啦！
将 Cat 类的部分内部变量设为 private，不过只能是那些可通过方法访问的变量。
Requirements:
1. Cat 类中的 name 变量必须为 private。
2. Cat 类中的 age 变量必须为 private。
3. Cat 类中的 weight 变量必须为 public。
4. Cat 类中必须有三个变量。
5. Cat 类必须包含 private 和 public 变量。
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}