package zh.codegym.task.task06.task0609;

/* 两点之间的距离
实现 static double getDistance(x1, y1, x2, y2) 方法。该方法应计算两点之间的距离。
使用 double Math.sqrt(double a) 方法，该方法将计算所传递参数的平方根。
Requirements:
1. getDistance 方法必须返回 double 值。
2. getDistance 方法必须为 static。
3. getDistance 方法必须为 public。
4. getDistance 方法必须返回两点之间的距离。
5. getDistance 方法必须使用 double Math.sqrt(double a) 方法。
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //在此编写你的代码
        double length = Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2);
        return Math.sqrt(length);
    }

    public static void main(String[] args) {
        double length = getDistance(1,1,0,0);
        System.out.println(length);
    }
}
