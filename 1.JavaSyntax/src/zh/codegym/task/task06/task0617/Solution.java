package zh.codegym.task.task06.task0617;

/* 新想法的记事本
1.在 Solution 类中，创建 public static Idea 类
2.在 Idea 类中，声明返回任意非空字符串的 public String getDescription() 方法
3.在 Solution 类中，创建将显示想法描述（getDescription 方法返回的内容）的 static public void printIdea(Idea idea) 方法
Requirements:
1. 在 Solution 类中，创建 public static Idea 类。
2. 在 Idea 类中，创建 public String getDescription() 方法。
3. getDescription 方法必须返回任意非空字符串。
4. 在 Solution 类中，创建 public static void printIdea(Idea idea) 方法。
5. printIdea 方法应在屏幕上显示想法描述。*/

public class Solution {
    public static class Idea{
        public String string = "TikTok";

        public String getDescription(){
            return string;
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }
}
