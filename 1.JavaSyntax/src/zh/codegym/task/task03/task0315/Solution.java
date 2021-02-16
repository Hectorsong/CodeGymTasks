package zh.codegym.task.task03.task0315;

/* 
七色彩虹...
*/

public class Solution {

    public static void main(String[] args) {
        //在此编写你的代码
        Red r1 = new Red();
//        r1.Red();
        Orange o1 = new Orange();
//        o1.Orange();
        Yellow y1 = new Yellow();
//        y1.Yellow();
        Green g1 = new Green();
//        g1.Green();
        Blue b1 = new Blue();
//        b1.Blue();
        Indigo i1 = new Indigo();
//        i1.Indigo();
        Violet v1 = new Violet();
//        b1.Blue();
    }

    public static class Red {
        public Red() {
            System.out.println("红色");
        }  //构造方法
    }

    public static class Orange {
        public Orange() {
            System.out.println("橙色");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("黄色");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("绿色");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("蓝色");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("靛色");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("紫色");
        }
    }
}
