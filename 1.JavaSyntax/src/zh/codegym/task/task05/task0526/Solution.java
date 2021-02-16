package zh.codegym.task.task05.task0526;

/* 男人和女人
1.在 Solution 类内部，创建 public static Man 和 public static Woman 类。
2.该类必须包含以下字段：String name, int age, String address.
3.创建包含所有可能参数的构造方法。
4.使用构造方法为每个类创建两个包含完整数据的对象。
5.在屏幕上使用以下格式显示对象：name + " " + age + " " + address
Requirements:
1. 在 Solution 类中，创建 public static Man 类。
2. 在 Solution 类中，创建 public static Woman 类。
3. Man 类必须包含以下变量：String name、int age 和 String address。
4. Woman 类必须包含以下变量：String name、int age 和 String address。
5. Man 和 Woman 类必须包含带 String、int 和 String 参数的构造方法。
6. 构造方法必须初始化实例变量。
7. 在 main 方法中，需要为每种类型创建两个对象。
8. main 方法应以指定格式在屏幕上显示所创建的对象。
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Man man1 = new Man("Hector",18, "beijing");
        Man man2 = new Man("Hector",18, "beijing");
        man1.print();
        man2.print();
        Woman woman1 = new Woman("Hector",20, "beijing");
        Woman woman2 = new Woman("Hector",20, "beijing");
        woman1.print();
        woman2.print();
    }

    //在此编写你的代码
    public static class Man {
        String name;
        int age;
        String address;
        public Man(){}
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void print(){
            System.out.println(name + " " + age + " " + address);
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(){}
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void print(){
            System.out.println(name + " " + age + " " + address);
        }
    }
}
