package zh.codegym.task.task04.task0403;

/* 
猫的名字叫什么？
*/

public class Cat {

    private String name = "无名猫";

    public void setName(String name) {
        //在此编写你的代码
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("辛巴");
        System.out.println(cat.name);
    }
}
