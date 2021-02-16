package zh.codegym.task.task05.task0505;

/* 
猫类大屠杀
使用 Cat 类创建三只猫。
在猫之间举行三组两两对战。
你无需创建 Cat 类。对于战斗，请使用 boolean fight (Cat anotherCat) 方法。
在屏幕上显示每场战斗的结果，每行显示一个结果。
Requirements:
1. 程序不得从键盘读取数据。
2. 你需要创建三个 Cat 对象。
3. 你需要进行三场战斗。
4. 程序应显示每场战斗的结果，每行显示一个结果。
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Cat c1 = new Cat("加菲猫",5,5,879);
        Cat c2 = new Cat("加菲猫",6,4,880);
        Cat c3 = new Cat("加菲猫",7,3,860);
        System.out.println(c1.fight(c2));
        System.out.println(c2.fight(c3));
        System.out.println(c3.fight(c1));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
