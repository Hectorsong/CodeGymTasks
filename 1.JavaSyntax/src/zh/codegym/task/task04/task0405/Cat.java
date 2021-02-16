package zh.codegym.task.task04.task0405;

/* 
设置猫的数量
*/
/*
* 设置猫的数量
编写 setCatCount 方法。该方法必须设置猫的数量 (catCount)。
Requirements:
1. Cat 类中只能包含一个 catCount 变量。
2. 变量 catCount 必须为 static int、包含一个 private 访问修饰符，并且被初始化为零。
3. Cat 类中必须包含两个方法：setCatCount 和 main。
4. Cat 类的 setCatCount 方法必须将 catCount 变量的值设置为等于传递的参数。
* */


public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        //在此编写你的代码
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {
        //Cat c1 = new Cat();
        Cat.setCatCount(10);
        System.out.println(catCount);
    }
}
