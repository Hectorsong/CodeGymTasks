package zh.codegym.task.task05.task0514;

/* 程序员创建人
创建 Person 类。Person 类应包含 String 变量 name 和 int 变量 age。
添加 initialize(String name, int age) 方法，你将在该方法中初始化变量 name 和 age。
在 main 方法中，创建一个 Person 对象，并在变量 person 中存储对该对象的引用。
使用任意值调用 initialize 方法。
Requirements:
1. Solution 类必须包含 Person 类。
2. Person 类必须包含 String 变量 name。
3. Person 类必须包含 int 变量 age。
4. Person 类必须包含将 name 和 age 作为参数并初始化相应实例变量的 initialize 方法。
5. 需要创建 Person 对象，并将对该对象的引用放入变量 person 中。
6. 必须在创建的对象上调用 initialize 方法，并将一些参数传递给它。*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Person person = new Person();
        person.initialize("Hector", 18);
    }

    static class Person {
        //在此编写你的代码
        private String name;
        private int age;

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }
}
