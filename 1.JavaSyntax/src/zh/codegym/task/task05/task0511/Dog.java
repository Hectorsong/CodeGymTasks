package zh.codegym.task.task05.task0511;

/* 创建 Dog 类
创建包含三个初始化器的 Dog 类：
- name
- name, height
- name, height, color
Requirements:
1. 程序不得从键盘读取数据。
2. Dog 类必须包含 String 变量 name。
3. Dog 类必须包含 int 变量 height。
4. Dog 类必须包含 String 变量 color。
5. 该类必须包含将 name 作为参数并初始化相应实例变量的 initialize 方法。
6. 该类必须包含将 name 和 height 作为参数并初始化相应实例变量的 initialize 方法。
7. 该类必须包含将 name、height 和 color 作为参数并初始化相应实例变量的 initialize 方法。
*/

public class Dog {
    //在此编写你的代码
    private String name;
    private int height;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int height)
    {
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
