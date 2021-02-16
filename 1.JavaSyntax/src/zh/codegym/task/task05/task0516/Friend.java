package zh.codegym.task.task05.task0516;

/* 你不能购买朋友
创建包含三个构造方法的 Friend 类：
- name
- name, age
- name, age, sex
Requirements:
1. Friend 类必须包含 String 变量 name。
2. Friend 类必须包含 int 变量 age。
3. Friend 类必须包含 char 变量 sex。
4. 该类必须包含将 name 作为参数并初始化相应实例变量的构造方法。
5. 该类必须包含将 name 和 age 作为参数并初始化相应实例变量的构造方法。
6. 该类必须包含将 name、age 和 sex 作为参数并初始化相应实例变量的构造方法。
*/

public class Friend {
    //在此编写你的代码
    private String name;
    private int age;
    private char sex;

    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
