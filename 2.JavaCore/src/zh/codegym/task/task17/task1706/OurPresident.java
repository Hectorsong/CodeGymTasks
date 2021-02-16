package zh.codegym.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized(OurPresident.class){
//            if (president == null)
            OurPresident presidentTemp = new OurPresident();
            //静态代码块随着类的加载执行一次，类被回收，static修饰的变量消失。
            /*
静态代码块：用于给类初始化，类加载时就会被加载执行，只加载一次。

构造代码块：用于给对象初始化的。只要建立对象该部分就会被执行，且优先于构造函数。
//构造块：直接在类中定义且没有加static关键字的代码块称为{}构造代码块。
构造代码块在创建对象时被调用，每次创建对象都会被调用，并且构造代码块的执行次序优先于类构造函数。

构造函数：  给对应对象初始化的，建立对象时，选择相应的构造函数初始化对象。

创建对象时，三者被加载执行顺序：静态代码块--->构造代码块--->构造函数
            * */
            president = presidentTemp;
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
//        president = new OurPresident();
        return president;
    }
}
