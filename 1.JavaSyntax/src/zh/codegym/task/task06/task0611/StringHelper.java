package zh.codegym.task.task06.task0611;

/* StringHelper 类
创建 StringHelper 类，其中包含 2 个 static 方法：
String multiply(String s, int count) - 返回已重复 count 次的字符串。
String multiply(String s) - 返回已重复 5 次的字符串。
例如：
Amigo -> AmigoAmigoAmigoAmigoAmigo
Requirements:
1. 程序不得从键盘读取数据。
2. StringHelper 类的方法必须返回字符串。
3. StringHelper 类的方法必须为 static。
4. StringHelper 类的方法必须为 public。
5. multiply(String s, int count) 方法必须返回已重复 count 次的字符串。
6. multiply(String s) 方法必须返回已重复 5 次的字符串。
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = multiply(s,5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0 ; i < count ; i++){
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo"));
    }
}
