package zh.codegym.task.task10.task1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 从列表安全检索
创建一个整数列表。
从键盘输入 20 个整数。
创建一种方法来安全地从列表中检索数字：
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
该方法必须返回基于其索引的列表项目。
如果检索元素时发生异常，则必须捕获该异常，且该方法应返回 defaultValue。
Requirements:
1. 程序应从键盘读取 20 个数字。
2. 程序应在屏幕上显示数据。
3. safeGetElement 方法必须基于其索引返回列表项，除非该方法中发生异常。
4. 如果方法中发生异常，则 safeGetElement 方法必须返回 defaultValue。捕获异常。
5. safeGetElement 方法不得抛出异常。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
/*        try {

            for (int i = index ; i < list.size(); i++) {
                int num = list.get(i);
                while (num == defaultValue){
                    return num;
                }
            }
            return -1;
        }catch (Exception e){
            return -1;
        }*/
        try
        {
            return list.get(index);
        }
        catch (Exception e)
        {
            return defaultValue;
        }
    }

}
