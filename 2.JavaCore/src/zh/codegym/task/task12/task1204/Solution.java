package zh.codegym.task.task12.task1204;

/* 无论是鸟还是灯
编写一种方法，该方法确定传递给它的对象的类类型，然后在屏幕上显示相应的消息：Cat、Dog、Bird 和 Lamp。
Requirements:
1. 程序必须在屏幕上显示文本。
2. 不要更改 Cat 类。
3. 不要更改 Dog 类。
4. 不要更改 Bird 类。
5. 不要更改 Lamp 类。
6. printObjectType() 方法必须显示以下消息之一，具体取决于传递给它的对象。例如，对于 Solution.Lamp 对象，它应该显示“灯”。
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if(o instanceof Cat){
            System.out.println("Cat");
        }
        if (o instanceof Bird){
            System.out.println("Bird");
        }
        if (o instanceof Lamp){
            System.out.println("Lamp");
        }
        if (o instanceof Dog){
            System.out.println("Dog");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
