package zh.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 包含猫的集
1.在 Solution 类的内部，创建 public static Cat 类。
2.实现 createCats 方法。必须创建一个包含猫的 Set 并向其中添加 3 个猫。
3.在 main 方法中，从 Set cats 中删除一个猫。
4.实现 printCats 方法。该方法应显示集中剩余的所有猫。
每行显示一个猫。
Requirements:
1. 程序应在屏幕上显示文本。
2. 在 Solution 类的内部，必须包含一个具有默认构造方法的 public static Cat 类。
3. Solution 类的 createCats() 方法必须返回包含 3 个猫的 Set。
4. Solution 类的 printCats() 方法必须显示集中的所有猫。每行显示一个猫。
5. main() 方法应调用一次 createCats() 方法。
6. main() 方法应调用 printCats() 方法。
7. main() 方法必须从猫集中删除一个猫。
*/
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        int i = 0;
        while (iterator.hasNext()){
            iterator.next();
            if (i == 1){
                iterator.remove();
            }
            i++;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat());
        catSet.add(new Cat());
        catSet.add(new Cat());
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat temp : cats
             ) {
            System.out.println(temp);
        }
    }

    public static class Cat{
        public Cat(){}
    }
}
