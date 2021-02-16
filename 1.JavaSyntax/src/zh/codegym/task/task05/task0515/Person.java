package zh.codegym.task.task05.task0515;

/* 初始化对象
仔细研究 Person 类。
更改该类，以便只有一个 initialize 方法初始化 Person 类的所有实例变量。
Requirements:
1. 程序不得从键盘读取数据。
2. Person 类必须包含 5 个变量。
3. 该类必须包含一个 initialize 方法。
4. initialize 方法必须带有五个参数。
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
