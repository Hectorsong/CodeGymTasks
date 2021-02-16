package zh.codegym.task.task04.task0406;

/* 
名字登记
*/
/*
* 名字登记
完成 setName 方法的代码编写，使其将 private String fullName 的值设置为本地 String 变量 fullName 的值。
Requirements:
1. 1.Cat 类只能包含一个 fullName 变量。
2. 2.变量 fullName 必须为 String，并且包含一个 private 访问修饰符。
3. 3.Cat 类只能包含两个方法：setName 和 main。
4. 4.setName 方法必须包含一个本地变量 fullName。
5. 5.Cat 类的 setName 方法必须将全局 private String 变量 fullName 的值设置为等于本地变量 fullName。
*
* */
public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
        //在此编写你的代码
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲","猫");
        System.out.println(c1.fullName);
    }
}
