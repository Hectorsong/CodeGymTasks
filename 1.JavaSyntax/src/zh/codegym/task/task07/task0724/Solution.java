package zh.codegym.task.task07.task0724;

/* 家庭人口普查
创建 Human 类，该类包含 String name、boolean sex、int age、Human father 和 Human mother 字段。创建并填充对象，以便我们最终得到：两个祖父、两个祖母、一个父亲、一个母亲和三个孩子。在屏幕上显示对象。

注意：
如果你在 Human 类中编写自己的 String toString() 方法，该方法将用于在屏幕上显示对象。

示例输出：
名字：安娜，性别：女，年龄：21，父亲：保罗，母亲：凯特
名字：凯特，性别：女，年龄：55
名字：本，性别：男，年龄：2，父亲：迈克尔，母亲：安娜
…
Requirements:
1. 程序不得从键盘读取数据。
2. 向 Human 类中添加以下字段：String name、boolean sex、int age、Human father 和 Human mother。
3. 添加构造方法：public Human(String name, boolean sex, int age)。
4. 添加构造方法：public Human(String name, boolean sex, int age, Human father, Human mother)。
5. 创建 9 个不同的 Human 对象（4 个没有父母的对象和 5 个有父母的对象）。
6. 在屏幕上显示所有已创建的对象。
*/

public class Solution {
    public static void main(String[] args) {
        Human humanGrandFather = new Human("迈克尔", true , 65);
        Human humanGrandMother = new Human("凯特", false , 62);
        Human humanGrandPa = new Human("Hector", true , 62);
        Human humanGrandMa = new Human("Ellen", false , 62);
        Human humanFather = new Human("Jack", true , 62, humanGrandFather , humanGrandMother);
        Human humanMother = new Human("Rose", false , 62, humanGrandPa, humanGrandMa);
        Human humanSon1 = new Human("Michael", true , 45 , humanFather, humanMother);
        Human humanDaughter1 = new Human("Addy", false , 45, humanFather, humanMother);
        Human humanDaughter2 = new Human("Ada", false , 45, humanFather, humanMother);
        System.out.println(humanGrandFather.toString());
        System.out.println(humanGrandMother.toString());
        System.out.println(humanGrandPa.toString());
        System.out.println(humanGrandMa.toString());
        System.out.println(humanFather.toString());
        System.out.println(humanMother.toString());
        System.out.println(humanSon1.toString());
        System.out.println(humanDaughter1.toString());
        System.out.println(humanDaughter2.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            if (this.father != null)
                text += "，父亲：" + this.father.name;

            if (this.mother != null)
                text += "，母亲：" + this.mother.name;

            return text;
        }
    }
}