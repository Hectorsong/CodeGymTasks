package zh.codegym.task.task08.task0824;

/* 构建家庭
1.创建包含 String name、boolean sex、int age 和 ArrayList<Human> children 字段的 Human 类。
2.创建并填充对象，以便我们最终得到：两个祖父、两个祖母、一个父亲、一个母亲和三个孩子。
3.显示所有 Human 对象（提示：使用 Human 类的 toString() 方法）。
Requirements:
1. 程序应在屏幕上显示文本。
2. Human 类必须包含四个字段。
3. Human 类必须包含一个方法。
4. Solution 类必须包含一个方法。
5. 程序应创建对象并用数据填充它们，以得到两个祖父、两个祖母、一个父亲、一个母亲和三个孩子。然后，程序应在屏幕上显示所有 Human 对象。
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> grandFatherMotherChildren = new ArrayList<>();
        ArrayList<Human> grandPaMaChildren = new ArrayList<>();
        ArrayList<Human> fathermotherChildren = new ArrayList<>();
        ArrayList<Human> childrenKids = new ArrayList<>();
        Human children1 = new Human("child1", true, 15, childrenKids);
        Human children2 = new Human("child2", true, 14, childrenKids);
        Human children3 = new Human("child3", false, 13, childrenKids);

        fathermotherChildren.add(children1);
        fathermotherChildren.add(children2);
        fathermotherChildren.add(children3);
        Human father = new Human("Father", true, 41, fathermotherChildren);
        Human mother = new Human("Mother", false, 43, fathermotherChildren);

        grandPaMaChildren.add(father);
        Human grandFather = new Human("grandFather", true, 65, grandPaMaChildren);
        Human grandMother = new Human("grandFather", false, 63, grandPaMaChildren);

        grandFatherMotherChildren.add(mother);
        Human grandPa = new Human("grandPa", true, 70, grandFatherMotherChildren);
        Human grandMa = new Human("grandMa", false, 71, grandFatherMotherChildren);

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFather.toString());
        System.out.println(grandMother.toString());
        System.out.println(grandPa.toString());
        System.out.println(grandMa.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age , ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

/*        public Human(String name, boolean sex, int age){
            name = this.name;
            sex = this.sex;
            age = this.age;
        }*/

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            if (this.children != null){
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += "，孩子：" + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += "，" + child.name;
                    }
                }
            }

            return text;
        }
    }

}
