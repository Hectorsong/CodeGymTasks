package zh.codegym.task.task06.task0614;

import java.util.ArrayList;

/* static 猫
1.在 Cat 类中，添加 public static ArrayList<Cat> 变量 cats。
2.每次创建一只新猫（新的 Cat 对象）时，都将其添加到变量 cats。创建 10 个 Cat 对象。
3.printCats 方法应在屏幕上显示所有的猫。你需要使用变量 cats。
Requirements:
1. 向 Cat 类中添加 public static ArrayList<Cat> 变量 cats。
2. 变量 cats 必须被初始化。
3. main 方法应创建 10 个 Cat 对象（使用 Cat() 构造方法）。
4. main 方法必须将创建的所有猫添加到变量 cats。
5. printCats 方法应显示变量 cats 中的所有 Cat 对象。每行显示一个对象。
*/

public class Cat {
    //在此编写你的代码
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //在此编写你的代码
        for (int i = 0 ; i<10 ; i++){
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for(Cat cat:cats){
            System.out.println(cat);
        }
    }
}
