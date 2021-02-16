package zh.codegym.task.task05.task0503;


/* Dog 类的 getter 和 setter
创建 Dog 类。Dog 类应该包含 String 变量 name 和 int 变量 age。
为 Dog 类的所有变量创建 getter 和 setter。
Requirements:
1. 程序不得从键盘读取数据。
2. Dog 类必须包含 String 变量 name。
3. Dog 类必须包含 int 变量 age。
4. 该类必须包含变量 name 的 setter。
5. 该类必须包含变量 name 的 getter。
6. 该类必须包含变量 age 的 setter。
7. 该类必须包含变量 age 的 getter。
*/


public class Dog {
    //在此编写你的代码
    private String name;
    private int age;
    public Dog(){
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("小黑");
        d1.setAge(5);
    }
}
