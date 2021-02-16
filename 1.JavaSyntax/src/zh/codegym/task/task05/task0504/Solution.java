package zh.codegym.task.task05.task0504;


/* 
三个“火枪手”
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Cat c1 = new Cat("加菲猫",5,5,879);
        Cat c2 = new Cat("加菲猫",5,8,456);
        Cat c3 = new Cat("加菲猫",5,9,785);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}