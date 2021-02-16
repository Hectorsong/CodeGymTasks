package zh.codegym.task.task04.task0404;

/* 
对猫进行登记
*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        //在此编写你的代码
        Cat.catCount++;
        System.out.println(catCount);
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.addNewCat();
    }
}
