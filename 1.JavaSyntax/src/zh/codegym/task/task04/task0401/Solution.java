package zh.codegym.task.task04.task0401;

/* 
这个年龄不适合我...
*/
public class Solution {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("年龄：" + person.age);
        person.adjustAge(person.age);
        System.out.println("调整后的年龄：" + person.age);
    }

    public static class Person {
        public  int age = 20;

        public  void adjustAge(int age) {
            /*静态存储（含static）：调用对象时，需要将对象之前的类名加上（如题目的Apple.applePrice）。
            非静态存储（不含static）：调用对象时，需要在对象之前加一个this（如题目中this.age）*/

            this.age = age + 20;
            System.out.println("adjustAge() 中的年龄为 " + this.age);
        }
    }
}
