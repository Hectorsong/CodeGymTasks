package zh.codegym.task.task05.task0517;

/* Requirements:
1. Cat 类必须包含 String 变量 name。
2. Cat 类必须包含 int 变量 age。
3. Cat 类必须包含 int 变量 weight。
4. Cat 类必须包含 String 变量 address。
5. Cat 类必须包含 String 变量 color。
6. 该类必须包含一个构造方法，该构造方法将 name 作为参数，但初始化除 address 之外的所有变量。
7. 该类必须包含一个构造方法，该构造方法将 name、weight 和 age 作为参数，并初始化除 address 之外的所有变量。
8. 该类必须包含一个构造方法，该构造方法将 name 和 age 作为参数，并初始化除 address 之外的所有变量。
9. 该类必须包含一个构造方法，该构造方法将 weight 和 color 作为参数，并初始化除 name 和 address 之外的所有变量。
10. 该类必须包含一个构造方法，该构造方法将 weight、color 和 address 作为参数，并初始化除 name 之外的所有变量。
*/

public class Cat {
    //在此编写你的代码
    private String name;
    private int age;
    private int weight;
    private String address = null;
    private String color;

    public  Cat(String name)
    {
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "yellow";
    }
    public  Cat(String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "yellow";
    }
    public  Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "yellow";
    }
    public  Cat(int weight, String color)
    {
        this.age = 1;
        this.weight = weight;
        this.color = color;
    }
    public  Cat(int weight, String color, String address)
    {
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    
    public static void main(String[] args) {

    }
}
