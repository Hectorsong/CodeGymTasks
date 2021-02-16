package zh.codegym.task.task19.task1913;

/* 
仅输出数字
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);

        System.setOut(newPrintStream);//改变标准输出流，默认指向控制台，改变后指向newPrintStream

        //将标准输出流的数据打印到当前的标准输出流newPrintStream即为byteArrayOutputStream
        testString.printSomething();

        System.setOut(defaultPrintStream);

        String result = byteArrayOutputStream.toString();
        result = result.replaceAll("\\D" , "");
        System.out.println(result);

    }

    public static class TestString {

        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
