package zh.codegym.task.task12.task1205;

/* 动物识别
编写一个方法，该方法将确定传递给它的对象的类，并返回以下值之一：“奶牛”、“鲸鱼”、“狗”或“未知动物”。
Requirements:
1. 程序必须在屏幕上显示文本。
2. 不要更改 Cow 类。
3. 不要更改 Dog 类。
4. 不要更改 Whale 类。
5. 不要更改 Pig 类。
6. getObjectType() 方法必须返回以下值之一：“奶牛”、“鲸鱼”、“狗”或“未知动物”，具体取决于传递给它的对象。例如，它应该针对 Solution.Cow 对象返回“奶牛”。
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow){
            return  "奶牛";
        }
        if (o instanceof Dog){
            return  "狗";
        }
        if (o instanceof Whale){
            return  "鲸鱼";
        }
        return "未知动物";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
