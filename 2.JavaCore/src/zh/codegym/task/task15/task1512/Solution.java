package zh.codegym.task.task15.task1512;

/* 
最简单的代码：第 2 部分
*/

public class Solution {

    public static void main(String[] args) {
        SiamCat coco = new SiamCat("可可");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {
    }

    public static class NormalCat extends NakedCat {
        public NormalCat(){
        }

        public NormalCat(String name) {
            System.out.println("我的名字是 " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
