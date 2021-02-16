package zh.codegym.task.task19.task1914;

/* 
问题解决
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


//        String result = newPrintStream.toString();
//      此处newPrintStream存的是byteArrayOutputStream的地址。
        String result = byteArrayOutputStream.toString();
        String[] arry = result.split(" ");
        int printNumber;
        switch (arry[1]){
            case "+" :
                printNumber = Integer.parseInt(arry[0]) + Integer.parseInt(arry[2]);
                break;
            case "-" :
                printNumber = Integer.parseInt(arry[0]) - Integer.parseInt(arry[2]);
                break;
            case "*" :
                printNumber = Integer.parseInt(arry[0]) * Integer.parseInt(arry[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + arry[1]);
        }
        System.out.println(String.format("%s %s %s = %d", arry[0], arry[1], arry[2], printNumber));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

