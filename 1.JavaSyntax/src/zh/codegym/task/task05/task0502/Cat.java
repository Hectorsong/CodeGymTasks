package zh.codegym.task.task05.task0502;

/* 实现 fight 方法
实现 boolean fight(Cat anotherCat) 方法：
基于猫的体重、年龄和力量实现一种猫咪作战机制。
你可以自行决定猫的性格如何影响战斗。
方法应确定我们 (this) 是否赢得战斗，即，如果我们赢了，则返回 true，否则将返回 false。
必须满足以下条件：
如果 cat1.fight(cat2)，则返回 true，
如果 cat2.fight(cat1)，则必须返回 false
Requirements:
1. Cat 类必须包含不带参数的构造方法。
2. Cat 类必须包含 public 字段 age、weight 和 strength。
3. Cat 类必须包含 fight 方法。
4. 在 fight 方法中，基于猫的体重、年龄和力量实现一种猫咪作战机制。
5. 每当我们与同一只猫作战时，该方法应返回相同的值。
6. 如果猫 1 击败猫 2，则猫 2 必须输给猫 1。
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }
    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public boolean fight(Cat anotherCat) {
        //在此编写你的代码
/*        System.out.println(this.strength);
        System.out.println(anotherCat.strength);*/
        if (this.strength - anotherCat.strength > 0 || this.weight - anotherCat.weight > 0 || this.age - anotherCat.age > 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(18,39,1024);
        Cat cat2 = new Cat(19,88,2048);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
