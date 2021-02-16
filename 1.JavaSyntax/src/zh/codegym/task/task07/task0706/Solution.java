package zh.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 街道和房屋
1.创建包含 15 个整数的数组。
2.从键盘输入值来填充数组。
3.让数组索引表示门牌号。特定索引处的数组值表示居住在相应房屋中的人数。
门牌号为奇数的房屋位于街道的一侧。门牌号为偶数的房屋位于街道的另一侧。弄清街道哪一侧居住的居民较多。
4.显示以下消息：“居住在门牌号为奇数的房屋的居民更多。”或“居住在门牌号为偶数的房屋的居民更多。”

注意：
索引为 0 处的房屋门牌号视为偶数。

Requirements:
1. 程序必须创建包含 15 个整数的数组。
2. 程序应从键盘为数组读取数字。
3. 如果奇数数组元素的总和大于偶数数组元素的总和，程序应显示“居住在门牌号为奇数的房屋的居民更多。”
4. 如果偶数数组元素的总和大于奇数数组元素的总和，程序应显示“居住在门牌号为偶数的房屋的居民更多。”
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0 ; i < 15 ; i++){
            list[i] = Integer.parseInt(bufferedReader.readLine());
            if (i%2 == 0) evenSum = evenSum + list[i];
            else oddSum = oddSum + list[i];
        }
        System.out.println(evenSum > oddSum ? "居住在门牌号为偶数的房屋的居民更多。" : "居住在门牌号为奇数的房屋的居民更多。");

    }
}
