package zh.codegym.task.task14.task1419;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* 
引入异常
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // 第一个异常
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = "123.4";
            Integer i =  Integer.valueOf(str);
        }catch (NumberFormatException e){
            exceptions.add(e);
        }

        try {
            int[] arrys = new int[1];
            arrys[2] = 0;
        }catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try {

        }catch (ArithmeticException e){
            exceptions.add(e);
        }

        try {
            Date d = null;
            d.after(new Date());
        }catch (NullPointerException e){
            exceptions.add(e);
        }
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new RuntimeException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new ClassCastException());
        exceptions.add(new TimeoutException());
    }
}
