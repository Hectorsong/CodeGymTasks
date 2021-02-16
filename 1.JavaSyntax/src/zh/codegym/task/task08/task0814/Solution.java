package zh.codegym.task.task08.task0814;

import java.util.*;

/* 大于 10？你不适合我们
创建一个数字集 (Set<Integer>) 并向其中添加 20 个不同的数字。
从集中删除所有大于 10 的数字。
Requirements:
1. 程序不应该在屏幕上显示文本。
2. 程序不得从键盘读取值。
3. Solution 类只能包含三个方法。
4. createSet() 方法必须创建并返回包含 20 个不同数字的 HashSet。
5. removeAllNumbersGreaterThan10() 方法必须从集中删除所有大于 10 的数字。
*/
public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set1.add(i);
        }
        return set1;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        int number = 10;
        for (int i = 0; i < list.size(); i++) {
            int listNumber = list.get(i);
            if (listNumber > number){
                list.remove(list.get(i));
                i--;
            }
        }
        HashSet<Integer> set1 = new HashSet<>(list);
        return set1;
    }

    public static void main(String[] args) {
        Set<Integer> set2 = createSet();
        HashSet<Integer> set3 = new HashSet<>(set2);
        removeAllNumbersGreaterThan10(set3);
    }
}
