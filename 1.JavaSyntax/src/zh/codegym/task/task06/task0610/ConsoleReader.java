package zh.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ConsoleReader 类
创建 ConsoleReader 类，其中包含 4 个 static 方法：
String readString() - 从键盘读取字符串
int readInt() - 从键盘读取数字
double readDouble() - 从键盘读取小数
boolean readBoolean() - 从键盘读取字符串“true”或“false”，并返回相应的 boolean 值（true 或 false）
请注意：在每个方法中，创建从控制台（BufferedReader 或 Scanner）读取数据的变量。
Requirements:
1. readString 方法必须读取和返回 String 值。
2. readInt 方法必须读取和返回 int 值。
3. readDouble 方法必须读取和返回 double 值。
4. readBoolean 方法必须读取和返回 boolean 值。
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String string = br1.readLine();
        return string;
    }

    public static int readInt() throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String string = br1.readLine();
        int number = Integer.parseInt(string);
        return number;
    }

    public static double readDouble() throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String string = br1.readLine();
        double number = Double.parseDouble(string);
        return number;
    }

    public static boolean readBoolean() throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String string = br1.readLine();
        Boolean aBoolean = Boolean.parseBoolean(string);
        return aBoolean;
    }

    public static void main(String[] args) {
        try {
            System.out.println(ConsoleReader.readBoolean());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
