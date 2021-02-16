package zh.codegym.task.task09.task0913;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
异常只捕获异常。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException");
        }


    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
