package zh.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 猫之间的关系
任务：每只猫都有名字和母亲。
创建描述此情况的类。
创建两个对象：猫女儿和猫母亲。
在屏幕上显示它们。

新任务：每只猫都有名字、父亲和母亲。
编辑 Cat 以使其反映这些关系。
创建 6 个对象：祖父（父亲的父亲）、外祖母（母亲的母亲）、父亲、母亲、儿子、女儿。
按以下顺序显示所有对象：祖父、外祖母、父亲、母亲、儿子、女儿。

示例输入：
祖父泰格
外祖母普斯
父亲奥斯卡
母亲米西
儿子辛巴
女儿可可

示例输出：
猫的名字为祖父泰格，无母亲，无父亲
猫的名字为外祖母普斯，无母亲，无父亲
猫的名字为父亲奥斯卡，无母亲，祖父泰格是父亲
猫的名字为母亲米西，外祖母普斯是母亲，无父亲
猫的名字为儿子辛巴，母亲米西是母亲，父亲奥斯卡是父亲
猫的名字为女儿可可，母亲米西是母亲，父亲奥斯卡是父亲

Requirements:
1. 程序应以指定顺序读取 6 只猫的名字。
2. main 方法应创建 6 个 Cat 对象。
3. 程序应显示 6 行有关猫的信息。
4. 有关祖父的行（第一行）必须符合条件。
5. 有关外祖母的行（第二行）必须符合条件。
6. 有关父亲的行（第三行）必须符合条件。
7. 有关母亲的行（第四行）必须符合条件。
8. 有关儿子的行（第五行）必须符合条件。
9. 有关女儿的行（第六行）必须符合条件。
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //祖父
        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);
        //外祖母
        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);
        //父亲
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName , "",  catGrandFather);
        //母亲
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName , catGrandMother , "");
        //儿子
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName , catMother , catFather );
        //女儿
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName , catMother , catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;



        Cat(String name) {
            this.name = name;
        }

        Cat(String name ,Cat parentMother , String string) {
            this.name = name;
            this.parentMother = parentMother;
        }
        Cat(String name, String string, Cat parentFather) {
            this.name = name;
            this.parentFather = parentFather;
        }
        Cat(String name, Cat parentMother ,Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            String result = null;
            if (parentMother == null && parentFather == null) {
                result = "猫的名字为" + name + "，无母亲" + "，无父亲";
            } else if (parentFather == null) {
                result = "猫的名字为" + name + "，" + parentMother.name + "是母亲，无父亲" ;
            } else if (parentMother == null) {
                result = "猫的名字为" + name +  "，无母亲，" + parentFather.name + "是父亲";
            }else
                result = "猫的名字为" + name + "，" + parentMother.name + "是母亲" + "，" + parentFather.name + "是父亲";
            return result;
        }


    }

}