package zh.codegym.task.task10.task1013;

/* Human 类构造函数
写出包含 6 个字段的 Human 类。
想一想，实施 10 个不同的构造函数。
每个构造函数都应该有意义。
Requirements:
1. 程序不得从键盘读取数据。
2. Human 类应该有 6 个字段。
3. Human 类的所有字段都必须是 private。
4. Human 类应该有 10 个构造函数。
5. Human 类的所有构造函数都必须是 public。
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String firstName;
        private String lastName;
        private double height;
        private double weight;
        private boolean sex;
        public Human(int age , String lastName  , double height , double weight){}
        public Human(int age , String firstName , String lastName , boolean sex){}
        public Human(int age , String firstName , double weight){}
        public Human(int age , String firstName , String lastName , double height ){}
        public Human(int age , String firstName , String lastName , double height , double weight , boolean sex){}
        public Human(int age , String firstName , String lastName , double height , double weight){}
        public Human(String firstName , String lastName , double height , double weight , boolean sex){}
        public Human(int age , String firstName ,  double height , double weight , boolean sex){}
        public Human(int age , String firstName , String lastName , double height , boolean sex){}
        public Human( String lastName , double height , double weight , boolean sex){}

    }
}
