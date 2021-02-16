package zh.codegym.task.task19.task1915;

/* 
重复文本
*/

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream defaultPrintStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String result = byteArrayOutputStream.toString();
        System.out.println(result);
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}

