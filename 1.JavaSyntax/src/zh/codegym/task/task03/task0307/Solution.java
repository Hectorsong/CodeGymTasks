package zh.codegym.task.task03.task0307;

/* 
你好，《星际争霸》！
*/
/*你好，《星际争霸》！
创建 5 个 Zerg 单位、3 个 Protoss 单位和 4 个 Terran 单位。
为它们全部赋予唯一的名字。


Requirements:
1. 不要更改 Zerg、Protoss 和 Terran 类。
2. 创建 5 个 Zerg 对象并为每个对象命名。
3. 创建 3 个 Protoss 对象并为每个对象命名。
4. 创建 4 个 Terran 对象并为每个对象命名。
* */
public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        z1.name = "z1123";
        z2.name = "z2123";
        z3.name = "z3123";
        z4.name = "z4123";
        z5.name = "z5123";

        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();
        p1.name = "p11234";
        p2.name = "p21234";
        p3.name = "p31234";

        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();
        t1.name = "t1123456";
        t2.name = "t2123456";
        t3.name = "t3123456";
        t4.name = "t4123456";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
