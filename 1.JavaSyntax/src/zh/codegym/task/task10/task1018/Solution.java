package zh.codegym.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 需要更正
任务：该程序演示了 HashMap 的工作原理：从键盘读取一组对（数字和字符串），将其放在一个 HashMap 中，然后显示 HashMap 的内容。
Requirements:
1. 程序必须从键盘读取数据。
2. 程序应在屏幕上显示文本。
3. Solution 类必须具有三个变量。
4. 程序应用从键盘读取的 10 对填充 HashMap。
5. 程序应显示 HashMap 的内容。每行显示一个值。
*/

public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
//        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
