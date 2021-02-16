package zh.codegym.task.task06.task0607;

/* 类计数器
在 Cat 类中声明 static int 变量 catCount。声明构造方法（如 public Cat()），它将此变量加 1。
Requirements:
1. 向 Cat 类中添加构造方法。
2. 构造方法必须为 public。
3. 向 Cat 类中添加 catCount 字段。
4. catCount 字段必须为 int。
5. catCount 字段必须为 static。
6. 构造方法必须将变量 catCount 的值加 1。
*/

public class Cat {
    //在此编写你的代码
    static int catCount;
    public Cat(){
        catCount++;
    }
    public static void main(String[] args) {

    }
}
