package zh.codegym.task.task11.task1123;

import java.util.Arrays;

/*
1. 程序不得从键盘读取数据。
2. 不要更改 Pair 类。
3. 不要更改 main 方法。
4. 完成编写 getMinimumAndMaximum 方法。它必须返回一个包含最小值和最大值的对。
5. 程序必须返回正确的结果。
6. getMinimumAndMaximum() 方法不应修改 inputArray 数组。
* */
public class Solution {

    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("最小值为 " + result.x);
        System.out.println("最大值为 " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }
        Arrays.sort(tempArray);

        return new Pair<Integer, Integer>(tempArray[0], tempArray[tempArray.length - 1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
