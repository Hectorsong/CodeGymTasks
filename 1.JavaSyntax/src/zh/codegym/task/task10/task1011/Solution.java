package zh.codegym.task.task10.task1011;

/* 
高薪
*/

public class Solution {

    public static void main(String[] args) {
        String s = "我不想学习 Java。我要高薪";

        for (int i = 0; i < 15; i++) {
            System.out.println(s.substring(i,15));
        }
    }
}