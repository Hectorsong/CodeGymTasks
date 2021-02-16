package zh.codegym.task.task15.task1521;

public class Tree {

    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Tree 编号 %d，Object 方法，参数: %s", number, s.getClass().getSimpleName()));
    }

    public void info(Number s) {
        System.out.println(String.format("Tree 编号 %d，Number 方法，参数: %s", number, s.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Tree 编号 %d，String 方法，参数: %s", number, s.getClass().getSimpleName()));
    }
}
