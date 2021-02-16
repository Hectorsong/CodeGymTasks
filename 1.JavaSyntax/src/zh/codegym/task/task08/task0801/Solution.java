package zh.codegym.task.task08.task0801;

/* 包含植物的 HashSet
使用 String 元素创建 HashSet。
向其中添加以下字符串：
西瓜
香蕉
樱桃
梨
哈密瓜
黑莓
人参
草莓
鸢尾花
土豆

显示集合的内容，每行显示一个元素。
观察条目的顺序有何变化。


Requirements:
1. 声明包含 String 元素的 HashSet 变量并立即初始化该变量。
2. 程序不得从键盘读取字符串。
3. 程序应根据条件将 10 个字符串添加到集合中。
4. 程序应显示集合中的 10 个字符串，每行显示一个。
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("西瓜");
        hashSet.add("香蕉");
        hashSet.add("樱桃");
        hashSet.add("梨");
        hashSet.add("哈密瓜");
        hashSet.add("黑莓");
        hashSet.add("人参");
        hashSet.add("草莓");
        hashSet.add("鸢尾花");
        hashSet.add("土豆");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
