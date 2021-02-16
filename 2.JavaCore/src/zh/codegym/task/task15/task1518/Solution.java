package zh.codegym.task.task15.task1518;

/* 
Static 修饰符和小猫
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Jerry";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat{
        public String name;
    }
}
