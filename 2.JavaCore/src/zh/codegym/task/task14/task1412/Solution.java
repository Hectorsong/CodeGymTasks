package zh.codegym.task.task14.task1412;

/* 
实现 printMainInfo 方法
*/


public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Drawable){
            ((Drawable) object).draw();
        }else if (object instanceof Movable){
            ((Movable) object).move();
        }
    }
    static interface Movable {
        void move();
    }
    static class Circle implements Movable {
        public void draw() {
            System.out.println("可以绘制");
        }
        public void move() {
            System.out.println("可以移动");
        }

    }
    static interface Drawable {
        void draw();
    }
    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("可以绘制");
        }
        public void move() {
            System.out.println("可以移动");
        }
    }
}
