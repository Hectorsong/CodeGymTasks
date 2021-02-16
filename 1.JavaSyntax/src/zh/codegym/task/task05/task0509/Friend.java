package zh.codegym.task.task05.task0509;

/* 创建 Friend 类
创建包含三个初始化器（三个 initialize 方法）的 Friend 类：
- name
- name, age
- name, age, sex
注意：
name 为 String，age 为 int，sex 为 char。
Requirements:
1. Friend 类必须包含 String 变量 name。
2. Friend 类必须包含 int 变量 age。
3. Friend 类必须包含 char 变量 sex。
4. 该类必须包含将 name 作为参数并初始化相应实例变量的 initialize 方法。
5. 该类必须包含将 name 和 age 作为参数并初始化相应实例变量的 initialize 方法。
6. 该类必须包含将 name、age 和 sex 作为参数并初始化相应实例变量的 initialize 方法。
*/

public class Friend {
    //在此编写你的代码
    private String name;
    private int age;
    private char sex ;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
