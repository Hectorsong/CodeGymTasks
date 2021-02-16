package zh.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* 字母数
从键盘输入 10 个字符串，并计算其中的不同字母数（针对 26 个小写英文字母）。在屏幕上按字母顺序显示结果。
示例输出：
a 5
b 8
c 3
d 7
e 0
…
z 9
Requirements:
1. 程序必须从键盘读取数据 10 次。
2. 程序应在屏幕上显示文本。
3. 所显示的文本应包含 26 行。
4. 输出的每一行应包含英文字母、空格以及在输入的行中找到该字母的次数。
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 字母
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // 读取字符串
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
/*        int[] abcTimes = new int[26];
        for (int i = 0; i < 10; i++) {
            String str = list.get(i);
                for (int k = 0; k < 26; k++){
                    for (int j = 1; j <= str.length(); j++) {
                    while (alphabet.get(k).equals(str.substring(j,j))){
                        abcTimes[k]++;
                    }
                }
            }

        }*/
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i) , 0);
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            for (int j = 0; j < str.length(); j++) {
                char currentChar = str.charAt(j);
                while (currentChar >= 'a' && currentChar <= 'z'){
                    map.put(currentChar , map.get(currentChar).intValue()+1);
                    break;
                }
            }
        }
        for (Map.Entry<Character , Integer> entry : map.entrySet()
             ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
