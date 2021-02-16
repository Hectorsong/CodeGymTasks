package zh.codegym.task.task19.task1911;

/* 
Reader 包装类
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //System.out 是 System 类中名为 out 的 static PrintStream 变量
        //此变量包含 final 修饰符，因此你可以直接为其赋予新值。
        // 但是，System 类包含一个可以执行此操作的特殊方法：setOut(PrintStream stream)
        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(outputStream);
        // 重新分配“标准”输出流。 将newPrintStream设置为当前的 System.out
        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String result = outputStream.toString().toUpperCase();
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }


    }
}
