package zh.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 20 个以字母“L”开头的单词
你需要创建 Set<String> 并添加 20 个以字母“L”开头的单词。
Requirements:
1. 不要更改 createSet() 方法的签名。
2. 程序不应该在屏幕上显示文本。
3. 程序不得从键盘读取值。
4. createSet() 方法必须创建并返回 set (HashSet)。
5. createSet() 方法返回的集必须包含 20 个以字母“L”开头的单词。
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set1.add("Less" + i);
        }
        return set1;
    }

    public static void main(String[] args) {
        createSet();
    }
}
