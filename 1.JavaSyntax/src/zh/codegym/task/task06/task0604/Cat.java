package zh.codegym.task.task06.task0604;

/* Cat 计数器
在 Cat 类构造方法 public Cat() 中，将 Cat 计数器（Cat 类的 static 变量 catCount）加 1。在 finalize 方法中将其减 1。
Requirements:
1. 将不带参数的构造方法 public Cat() 添加到 Cat 类中。
2. 构造方法必须将变量 catCount 的值加 1。
3. 将 finalize 方法添加到 Cat 类。
4. finalize 方法不应返回任何内容（返回类型为 void）。
5. finalize 方法应将变量 catCount 减 1。
*/

public class Cat {
    public static int catCount = 0;
    public Cat(){
        Cat.catCount++;
    }
    //在此编写你的代码

    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }
}