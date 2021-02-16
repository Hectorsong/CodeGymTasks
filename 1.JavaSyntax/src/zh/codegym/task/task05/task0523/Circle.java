package zh.codegym.task.task05.task0523;

/* 
构造方法
弄明白程序的功能。
查找并修复 Circle 类中的一个错误。不要更改 main 方法。
提示：
仔细研究默认构造方法。
Requirements:
1. 程序不得从键盘读取数据。
2. 不要更改 main 方法。
3. 程序应在屏幕上显示词语“红色”
4. Color 类的 getDescription 方法必须返回变量 description 的值。
5. Color 类的 setDescription 方法必须设置变量 description 的值。
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("红色");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        this.color = new Color();
    }

    public class Color {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
