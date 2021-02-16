package zh.codegym.task.task05.task0519;

/* 
绕圈子
*/


public class Circle {
    //在此编写你的代码
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    public  Circle(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public  Circle(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public  Circle(int centerX, int centerY, int radius, int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    
    public static void main(String[] args) {

    }
}
