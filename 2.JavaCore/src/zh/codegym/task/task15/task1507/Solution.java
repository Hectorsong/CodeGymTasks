package zh.codegym.task.task15.task1507;

/* 
OOP：方法重载
*/

public class Solution {

    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(byte m, byte n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, byte n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(byte m, int n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, byte n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(byte m, Integer n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(Integer m, int n, String value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(Integer m, Integer n, int value) {
        System.out.println("填写 String 对象");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

class Cat
{
    public static void print(Object o)
    {
//        System.out.println("12");
        System.out.println(o);
    }
    public static void print(String s)
    {
//        System.out.println("123");
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        Cat.print(1);
        Cat.print(null);
    }
}
