package zh.codegym.task.task05.task0520;

/* 
创建 Rectangle 类
*/


public class Rectangle {
    //在此编写你的代码
    private int left;
    private int top;
    private int width;
    private int height;
    public  Rectangle(int left)
    {
        this.left = left;
    }
    public  Rectangle(int left, int top)
    {
        this.left = left;
        this.top = top;
    }
    public  Rectangle(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public  Rectangle(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
