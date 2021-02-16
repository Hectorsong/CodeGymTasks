package zh.codegym.task.task09.task0918;

/* 相识是缘分，连异常都不例外
共有四个类别：MyException、MyException2、MyException3 和 MyException4。
继承类，以便得到任意两个已检查异常和任意两个未检查异常。
提示：仔细研究本节课第二个任务中的 Exception1、Exception2 和 Exception3。
Requirements:
1. Solution 类必须具有 4 个嵌套类：MyException、MyException2、MyException3 和 MyException4。
2. 所有嵌套类都必须继承异常类。
3. 其中两个类必须是已检查异常。
4. 其中两个类必须是未检查异常。*/



import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException2 extends NumberFormatException {
        public MyException2() throws Exception {
            throw new NumberFormatException();
        }
    }

    static class MyException extends NullPointerException {
        public MyException() throws Exception {
            throw new NullPointerException();
        }
    }

    static class MyException3 extends FileNotFoundException {
        public MyException3() throws Exception {
            throw new FileNotFoundException();
        }
    }
    static class MyException4 extends IOException {
            public MyException4() throws Exception {
                throw new IOException();
            }
    }
}


/*
package zh.codegym.task.task09.task0918;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.io.IOException;
*/
/*
相识是缘分，连异常都不例外
*//*


public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends NumberFormatException{
        public MyException() throws Exception{
            throw new NumberFormatException();
        }
    }

    static class MyException2 extends NullPointerException{
        public MyException2() throws Exception{
            throw new NullPointerException();
        }
    }

    static class MyException3 extends FileNotFoundException{
        public MyException3() throws Exception{
            throw new FileNotFoundException();
        }
    }

    static class MyException4 extends IOException{
        public MyException4() throws Exception{
            throw new IOException();
        }
    }
}*/
