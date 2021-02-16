package zh.codegym.task.task05.task0513;

/* 创建 Rectangle 类。此类的数据为 top、left、width、height。
创建尽可能多的 initialize(...) 方法
下面是一些示例：
- 指定 4 个参数：left、top、width 和 height
- 未指定 width/height（二者皆为 0）
- 未指定 height（它等于 width），我们将创建一个正方形
- 创建作为参数传递的另一个矩形的副本
Requirements:
1. 程序不得从键盘读取数据。
2. Rectangle 类必须包含 int 变量 top、left、width 和 height。
3. 该类必须至少包含一个 initialize 方法。
4. 该类必须至少包含两个 initialize 方法。
5. 该类必须至少包含三个 initialize 方法。
6. 该类必须至少包含四个 initialize 方法。
*/

public class Rectangle {
    //在此编写你的代码
    private int left;
    private int top;
    private int width;
    private int height;
    public void initialize(int left)
    {
        this.left = left;
    }
    public void initialize(int left, int top)
    {
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
