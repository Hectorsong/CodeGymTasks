package zh.codegym.task.task09.task0926;
import java.util.ArrayList;
/* 数字数组列表
创建元素为数字数组的列表。
然后在列表中添加五个数组对象，长度分别为 5、2、4、7 和 0。
在数组中填入任意数据并在屏幕上显示。
Requirements:
1. 程序不得从键盘读取数据。
2. createList 方法必须声明并初始化 ArrayList<int[]> 变量。
3. createList 方法必须返回创建的列表。
4. createList 方法必须在列表中添加 5 个元素。
5. 列表中的每个元素都必须是数字数组。第一个数组的长度必须是 5，第二个是 2，剩下的分别是 4、7 和 0。
6. 程序应显示列表中所有数组的元素。每行显示一个元素。
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[5]);
        arrayList.add(new int[2]);
        arrayList.add(new int[4]);
        arrayList.add(new int[7]);
        arrayList.add(new int[0]);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
