package zh.codegym.task.task05.task0512;

/* 创建 Circle 类
创建包含三个初始化器的 Circle 类：
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
Requirements:
1. 程序不得从键盘读取数据。
2. Circle 类必须包含 int 变量 centerX、centerY、radius、width 和 color。
3. 该类必须包含将 centerX、centerY 和 radius 作为参数并初始化相应实例变量的 initialize 方法。
4. 该类必须包含将 centerX、centerY、radius 和 width 作为参数并初始化相应实例变量的 initialize 方法。
5. 该类必须包含将 centerX、centerY、radius、width 和 radius 作为参数并初始化相应实例变量的 initialize 方法。
*/

public class Circle {
    //在此编写你的代码
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(int[] args) {

    }
}
