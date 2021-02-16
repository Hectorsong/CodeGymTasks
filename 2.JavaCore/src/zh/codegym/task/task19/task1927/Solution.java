package zh.codegym.task.task19.task1927;

/* 
上下文广告
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(defaultPrintStream);


        String[] byteArray = byteArrayOutputStream.toString().split("\n");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
            if (i % 2 != 0) {
                System.out.println("CodeGym - 在线 Java 课程");
            }
        }

    }

    public static class TestString {

        public void printSomething() {
            System.out.println("第一");
            System.out.println("第二");
            System.out.println("第三");
            System.out.println("第四");
            System.out.println("第五");
        }
    }
}
