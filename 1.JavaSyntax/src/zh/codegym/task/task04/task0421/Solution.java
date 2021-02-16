package zh.codegym.task.task04.task0421;

/* 
珍或珍？
使用键盘输入两个名字。如果这两个名字相同，则显示“名字相同”。
如果这两个名字不同，但它们的长度相同，则显示“名字长度相同”。
如果这两个名字和名字长度都不相同，则不显示任何内容。


Requirements:
1. 程序应从键盘读取两行内容。
2. 程序应包含 System.out.println() 或 System.out.print()。
3. 如果这两个名字相同，则显示“名字相同”
4. 如果这两个名字不同，但它们的长度相同，则显示“名字长度相同”
5. 如果这两个名字和名字长度都不相同，则不显示任何内容。
*/

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[2];
        for (int i = 0 ; i < 2 ; i++){
            String str = br1.readLine();
            array[i] = str;
        }/*
        if (array[0] == array[1]){
            System.out.println("名字相同");
        }else*/
        if (array[0].equals(array[1])){
            System.out.println("名字相同");
        } else if (array[0].length() == array[1].length()){
            System.out.println("名字长度相同");
        }
    }
}
