package zh.codegym.task.task09.task0914;

/* 捕获一组异常
1.有三个连续继承 Exception 的异常。
2.Exception1 类 extends Exception
3.Exception2 类 extends Exception1
4.Exception3 类 extends Exception2
5.有一种方法的签名如下：
public static void method1() throws Exception1, Exception2, Exception3
6.编写一个捕获所有如下三个异常的 catch 块：Exception1、Exception2 和 Exception3
Requirements:
1. main 方法必须调用 method1。
2. main 方法必须捕获 Exception1 异常。
3. main 方法必须捕获 Exception2 异常。
4. main 方法必须捕获 Exception3 异常。
5. 不要更改 method1 方法。
*/

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception3 e)
        {
            System.out.println("Exception3");
        } catch (Exception2 e)
        {
            System.out.println("Exception2");
        } catch (Exception1 e)
        {
            System.out.println("Exception1");
        }


    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
