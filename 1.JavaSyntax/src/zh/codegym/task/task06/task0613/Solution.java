package zh.codegym.task.task06.task0613;

/* 
Cat 和 static
*/

public class Solution {
    public static void main(String[] args) {
        // 创建 10 个 Cat 对象
        for (int i = 0 ; i < 10 ; i++){
            Cat cat = new Cat();
        }
        // 显示变量 catCount 的值
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // 创建 static 变量 catCount
        public  static int catCount;
        // 声明构造方法
        public Cat(){
            catCount++;
        }
    }
}
