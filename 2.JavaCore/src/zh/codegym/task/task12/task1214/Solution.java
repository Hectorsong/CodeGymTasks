package zh.codegym.task.task12.task1214;

/* 牛也是动物
让 Cow 类继承 Animal。
实现 Cow 类的缺失方法。
Requirements:
1. Animal 类必须为 abstract。
2. Cow 类不能为 abstract。
3. Cow 类必须继承 Animal 类。
4. Cow 类必须实现 Animal 类的 abstract 方法。
5. Cow 类的 getName() 方法必须为母牛返回一个好名字。
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{
        public String getName(){
            return "Cow";
        }
    }

}
