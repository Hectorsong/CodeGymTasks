package zh.codegym.task.task13.task1325;

import java.awt.*;

/* 
编译程序
*/

public class Solution {

    public static void main(String[] args) {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "狐狸";
        }
    }

    public static class BigFox extends Fox{

        @Override
        public Color getColor(){
            return null;
        }
    }
}
