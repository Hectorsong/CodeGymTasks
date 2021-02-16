package zh.codegym.task.task19.task1912;

/* 
Reader 包装类 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);//改变标准输出流，默认指向控制台，改变后指向printStream

        testString.printSomething();

        System.setOut(defaultPrintStream);//改变标准输出流为defaultPrintStream

        String result = byteArrayOutputStream.toString();
        result = result.replaceAll("te", "??");
        System.out.println(result);
    }

    public static class TestString {
        public TestString(){

        }

        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
