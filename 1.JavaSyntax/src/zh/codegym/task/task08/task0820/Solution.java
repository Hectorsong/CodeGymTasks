package zh.codegym.task.task08.task0820;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 动物集
1.在 Solution 类的内部，创建 public static 类 Cat 和 Dog。
2.实现 createCats 方法，该方法应返回包含 4 个猫的集。
3.实现 createDogs 方法，该方法应返回包含 3 个狗的集。
4.实现 join 方法，该方法应返回所有动物的合集（所有的猫和狗）。
5.实现 removeCats 方法，该方法应从 pets 集中删除 cats 集中的所有猫。
6.实现 printPets 方法，该方法应显示 pets 集中的所有动物。
每行显示一个动物。
Requirements:
1. 程序应在屏幕上显示文本。
2. Solution 类的内部应包含 public static 类 Cat 和 Dog。
3. Solution 类的 createCats() 方法必须返回包含 4 个猫的 Set。
4. Solution 类的 createDogs() 方法必须返回包含 3 个狗的 Set。
5. Solution 类的 join() 方法应返回所有动物（所有 cats 和 dogs）的合集。
6. removeCats() 方法应从 pets 集中删除 cats 集中的所有猫。
7. printPets() 方法应显示 pets 集中的所有动物。每行显示一个动物。
*/

public class Solution {
    private static Object Collection;

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogHashSet = new HashSet<>();
        dogHashSet.add(new Dog());
        dogHashSet.add(new Dog());
        dogHashSet.add(new Dog());
        return dogHashSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> sets = new HashSet<>();
        sets.addAll(cats);
        sets.addAll(dogs);
        return sets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
/*        Set<Object> copy = new HashSet<>(pets);
        Iterator<Object> iterator = copy.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (cats.contains(obj)){
                pets.remove(obj);
            }
        }*/
    }

    public static void printPets(Set<Object> pets) {
        for (Object obj: pets
             ) {
            System.out.println(obj);

        }
//        System.out.println();
    }

    public static class Cat{}
    public static class Dog{}
}
