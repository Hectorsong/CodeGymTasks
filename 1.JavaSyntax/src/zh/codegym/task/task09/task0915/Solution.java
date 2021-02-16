package zh.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 捕获自定义异常
1.分析由 BEAN.throwExceptions 方法抛出的异常。
2.handleExceptions 方法必须调用 BEAN.throwExceptions 方法并处理异常：
2.1. 如果有一个 FileSystemException，则记录下来（调用 BEAN.log 方法）并重新抛出
2.2. 如果有一个 CharConversionException 或任何其他 IOException，则只需记录下来（调用 BEAN.log 方法)）
3.在 handleExceptions 方法签名中添加项目 2.1 中抛出的异常类。
4.在 main 方法中，记录异常以处理剩余异常。使用 try-catch
提示：
如果在捕获 MyException 时你想放弃，可以使用类似于如下的代码重新抛出：
catch (MyException e) {
throw e;
}
Requirements:
1. removeFirstNameDuplicates() 方法必须调用 removeItemFromMapByValue() 方法。
2. handleExceptions 方法应记录 FileSystemException（调用 BEAN.log 方法），然后将其重新抛出。
3. handleExceptions 方法应只记录 CharConversionException（调用 BEAN.log 方法）。
4. handleExceptions 方法应只记录 IOException。
5. 在 handleExceptions 方法的签名中添加 FileSystemException 类。
6. main 方法应使用 try-catch。
7. main 方法应记录 handleExceptions 方法抛出的异常。
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args)  {
        try{
            handleExceptions();
        }catch (Exception e)
        {
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException {
        try {
            BEAN.throwExceptions();
        } catch (CharConversionException e)
        {
            BEAN.log(e);
        } catch (FileSystemException e)
        {
            BEAN.log(e);
            throw new FileSystemException(e.getMessage());
        } catch (IOException e)
        {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
