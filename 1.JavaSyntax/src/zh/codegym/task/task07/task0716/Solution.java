package zh.codegym.task.task07.task0716;

import java.util.ArrayList;

/* R 或 L
1.创建单词列表并自行填充该列表。
2.fix 方法应：
2.1. 从列表中删除所有包含字母“r”的单词
2.2. 复制所有包含字母“l”的单词。
2.3. 如果某个单词同时包含“r”和“l”，则保持不变。
2.4. 不要对其他单词执行任何操作。

例如：
rose
lyre
love

输出：
lyre
love
love


Requirements:
1. 程序不得从键盘读取数据。
2. fix 方法应从列表中删除所有包含字母“r”的单词。有一个例外：同时包含“r”和“l”的单词应保持不变。
3. fix 方法必须复制包含字母“l”的单词（将此单词的另一个实例添加到列表中）。有一个例外：不要复制同时包含“l”和“r”的单词。
4. fix 方法不应对同时包含“l”和“r”的单词执行任何操作。
5. fix 方法不应对既不包含“l”也不包含“r”的单词执行任何操作。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++ ){
            boolean b1 = list.get(i).contains("r");
            boolean b2 = list.get(i).contains("l");
            if(b1 && !b2){
                list.remove(i);
                i = i-1;
            }else if (b2 && !b1){
                list1.add(list.get(i));
            }
        }
        list.addAll(list1);
        return list;
    }
}