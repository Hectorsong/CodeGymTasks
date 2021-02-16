package zh.codegym.task.task15.task1524;

/* 
加载变量的顺序
*/

public class Solution {
    static {
        init();
    }

    static {
        System.out.println("Static 块");
    }

    {
        System.out.println("非 static 块");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "姓氏";


    public Solution() {
        System.out.println("Solution 构造方法");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
