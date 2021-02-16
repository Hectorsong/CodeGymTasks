package zh.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
掌握 static 块
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bf.readLine();
            if (str.equals("helicopter")){
                result = new Helicopter();
            }else if (str.equals("plane")){
                int number = Integer.parseInt(bf.readLine());
                result = new Plane(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
