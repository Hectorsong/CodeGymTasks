package zh.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 玩 Javarella
1.从键盘输入 20 个数字，保存到列表中，然后再将其归类到其他三个列表中：
可以被 3 整除的数字 (x%3==0)、可以被 2 整除的数字 (x%2==0) ，以及所有其他数字。
可以同时被 3 和 2 整除的数字（例如 6）将被归入两个列表中。
列表的声明顺序非常重要。
2.printList 方法应在每行显示一个列表项。
3.使用 printList 方法显示这三个列表。首先显示 x%3 列表，接着显示 x%2 列表，然后显示最后一个列表。
Requirements:
1. 声明并立即初始化 4 个 ArrayList<Integer> 变量。第一个列表为主列表。其他列表将作为补充列表。
2. 从键盘读取 20 个数字并将其添加到主列表中。
3. 将主列表中所有可以被 3 整除的数字添加到第一个补充列表中。
4. 将主列表中所有可以被 2 整除的数字添加到第二个补充列表中。
5. 将主列表中所有剩余的数字添加到第三个补充列表中。
6. printList 方法应在每行显示所传递列表的一个元素。
7. 程序应使用 printList 方法显示三个补充列表。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        ArrayList<Integer> x3List = new ArrayList<Integer>();  // x%3 列表
        ArrayList<Integer> x2List = new ArrayList<Integer>();    // x%2 列表
        ArrayList<Integer> otherList = new ArrayList<Integer>();    // 剩余的数字列表
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0 ; i < 20 ; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
            if (list.get(i) % 3 == 0){
                x3List.add(list.get(i));
                if (list.get(i) % 2 == 0) x2List.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0){
                x2List.add(list.get(i));
            }
            else otherList.add(list.get(i));
        }
        printList(x3List);
        printList(x2List);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list
             ) {
            System.out.println(i);
        }
    }
}
