package zh.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1.在 Solution 类中，创建继承 Thread 的 public static Read3Strings 类。
2.在 run 方法中，从控制台读取三行内容。
3.应该在一个线程上连续读取三行内容，然后合并为一个以空格分隔的字符串。
4.在 main 方法中，显示每个线程的结果。
5.使用 join。
* */
public class Solution {
    public static volatile BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        private List<String> result = new ArrayList<>();
        @Override
        public void run(){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String tempStr;
            try {
                for (int i = 0; i < 3; i++) {
                    tempStr = bufferedReader.readLine();
                    result.add(tempStr);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        public void printResult(){
            System.out.println(this.toString());
        }

        @Override
        public String toString(){
            String answer = "";
            for (String string: result ) {
                answer = answer + string + " ";
            }
            return answer;
        }
    }
}
