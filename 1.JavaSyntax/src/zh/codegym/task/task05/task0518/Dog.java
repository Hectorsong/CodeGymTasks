package zh.codegym.task.task05.task0518;

/* 
犬只注册
Requirements:
1. Dog 类必须包含 String 变量 name。
2. Dog 类必须包含 int 变量 height。
3. Dog 类必须包含 String 变量 color。
4. 该类必须包含将 name 作为参数并初始化相应实例变量的构造方法。
5. 该类必须包含将 name 和 height 作为参数并初始化相应实例变量的构造方法。
6. 该类必须包含将 name、height 和 color 作为参数并初始化相应实例变量的构造方法。
*/


public class Dog {
    //在此编写你的代码
    private String name;
    private int height;
    private String color;

    public  Dog(String name)
    {
        this.name = name;
    }
    public  Dog(String name, int height)
    {
        this.name = name;
        this.height = height;

    }
    public  Dog(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
