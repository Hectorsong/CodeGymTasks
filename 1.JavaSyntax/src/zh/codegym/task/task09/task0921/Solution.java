package zh.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* try-catch 中的方法
编写一个程序，该程序将从键盘读取数字 。
从键盘读取数字的代码必须在 readData 方法中。
将 readData 中的代码封装在 try-catch 块中。
如果用户输入文本而不是数字，则该方法应捕获异常 ，然后显示所有先前输入的数字。
在新行中按之前输入的顺序显示每个数字。
Requirements:
1. 程序必须从键盘读取数据。
2. 不要更改 main 方法。
3. main 方法不应抛出异常。
4. readData 方法必须包含一个 try-catch 块。
5. 如果用户输入文本而不是数字，则程序应显示所有先前输入的数字。
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            int temp;
            try {
                temp = Integer.parseInt(bufferedReader.readLine());
                arrayList.add(temp);
            } catch (NumberFormatException e){
                e.printStackTrace();
                for (Integer tempList: arrayList) {
                    System.out.println(tempList);
                }
                break;
            } catch (IOException e) {
                e.printStackTrace();
                for (Integer tempList: arrayList) {
                    System.out.println(tempList);
                }
                break;
            }
        }

    }
}
