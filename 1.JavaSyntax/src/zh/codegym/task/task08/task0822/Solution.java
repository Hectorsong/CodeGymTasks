package zh.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* N 个数字中的最小值
1.使用键盘输入数字 N。
2.读取 N 个整数并将其放入列表中：getIntegerList 方法。
3.找出列表项中的最小值：getMinimum 方法。
Requirements:
1. 程序应在屏幕上显示文本。
2. 程序应从键盘读取值。
3. Solution 类只能包含三个方法。
4. getIntegerList() 方法应从键盘读取数字 N 并返回包含 N 个元素的列表，该列表已使用从键盘读取的数字进行了填充。
5. getMinimum() 方法必须返回列表项中的最小值。
6. main() 方法应调用 getIntegerList() 方法。
7. main() 方法应调用 getMinimum() 方法。
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Iterator<Integer> iterator = array.iterator();
        int minNumber = iterator.next();
        while (iterator.hasNext()){
            int temp = iterator.next();
            minNumber = minNumber <= temp? minNumber : temp;
        }
//        int minNumber = Collections.min(array);
        return minNumber;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int listSize = Integer.parseInt(bufferedReader.readLine());
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            list1.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return list1;
    }
}
