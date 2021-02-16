package zh.codegym.task.task09.task0920;

/* 倒数
使用循环来写下从 10 到 0 的倒计时。要创建延迟，请使用 Thread.sleep(100);
将 sleep 调用封装在 try-catch 块中。
Requirements:
1. 程序应显示从 10 倒数到 0。
2. 程序应每 100 毫秒显示一个新数字。
3. 程序应使用“Thread.sleep(100);”。
4. main 方法必须有一个 try-catch 块。
5. main 方法不应抛出异常。
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
