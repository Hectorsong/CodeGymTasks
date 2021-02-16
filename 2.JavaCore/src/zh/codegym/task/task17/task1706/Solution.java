package zh.codegym.task.task17.task1706;

/* 
我们在 static 块的同步中再次遇到单例模式。
在 OurPresident 类内部的 static 块中创建 synchronized 块。
在 synchronized 块内，初始化 president。
Requirements:
•	OurPresident 类必须包含 private static OurPresident president。
•	OurPresident 类必须包含 public static OurPresident getOurPresident() 方法。
•	OurPresident 类必须包含 private 构造方法。
•	OurPresident 类必须包含 static 块。
•	OurPresident 类的 static 块必须包含 synchronized 块。
•	synchronized 块必须初始化 president。
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident.toString());
        System.out.println(ourPresident.toString());
        System.out.println(expectedPresident == ourPresident );
    }
}
