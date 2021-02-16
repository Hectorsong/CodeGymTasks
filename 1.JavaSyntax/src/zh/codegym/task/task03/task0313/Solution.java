package zh.codegym.task.task03.task0313;

public  class Solution {

    /** 数组元素的全组合 */
    static void combination(String[] Str) {
        String[] subStr = new String[Str.length]; //存储子组合数据的数组
        //全组合问题就是所有元素(记为n)中选1个元素的组合, 加上选2个元素的组合...加上选n个元素的组合的和
        for (int i = 0; i < Str.length; ++i) {
            final int m = i + 1;
            combination(Str, Str.length, m, subStr, m);
        }
    }

    /**
     *  n个元素选m个元素的组合问题的实现. 原理如下:
     *  从后往前选取, 选定位置i后, 再在前i-1个里面选取m-1个.
     *  如: 1, 2, 3, 4, 5 中选取3个元素.
     *  1) 选取5后, 再在前4个里面选取2个, 而前4个里面选取2个又是一个子问题, 递归即可;
     *  2) 如果不包含5, 直接选定4, 那么再在前3个里面选取2个, 而前三个里面选取2个又是一个子问题, 递归即可;
     *  3) 如果也不包含4, 直接选取3, 那么再在前2个里面选取2个, 刚好只有两个.
     *  纵向看, 1与2与3刚好是一个for循环, 初值为5, 终值为m.
     *  横向看, 该问题为一个前i-1个中选m-1的递归.
     */
    static void combination(String[] Str, int n, int m, String[] subStr, int subn) {
        if (m == 0) { //出口
            for (int i = 0; i < subn; ++i) {
                System.out.print(subStr[i]);
            }
            System.out.println();
        } else {
            for (int i = n; i >= m; --i) { // 从后往前依次选定一个
                subStr[m - 1] = Str[i - 1]; // 选定一个后
                combination(Str, i - 1, m - 1, subStr, subn); // 从前i-1个里面选取m-1个进行递归
            }
        }
    }

    /** 数组元素的全排列 */
    static void permutation(String[] Str) {
        permutation(Str, 0, Str.length - 1);
    }

    /** 数组中从索引begin到索引end之间的子数组参与到全排列 */
    static void permutation(String[] Str, int begin, int end) {
        if (begin == end) { //只剩最后一个字符时为出口
            for (int i = 0; i < Str.length; ++i) {
                System.out.print(Str[i]);
            }
            System.out.println();
        } else {
            for (int i = begin; i <= end; ++i) { //每个字符依次固定到数组或子数组的第一个
                if (canSwap(Str, begin, i)) { //去重
                    swap(Str, begin, i); //交换
                    permutation(Str, begin + 1, end); //递归求子数组的全排列
                    swap(Str, begin, i); //还原
                }
            }
        }
    }

    static void swap(String[] Str, int from, int to) {
        String temp = Str[from];
        Str[from] = Str[to];
        Str[to] = temp;
    }

    static boolean canSwap(String[] Str, int begin, int end) {
        for (int i = begin; i < end; ++i) {
            if (Str[i] == Str[end]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final String[] Str = new String[] {"我", "是", "山姆"};
        permutation(Str);
//        combination(Str);
    }
}

