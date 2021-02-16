package zh.codegym.task.task15.task1502;

/* 
OOP：动物继承
*/

import java.math.BigDecimal;

public class Solution {
    // Add the Goose and Dragon classes here

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "像恐龙";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "像猫";
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize(){
            String string = "鹅很小，"+ super.getSize();
            return string;
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize(){
            String string = "龙很大，"+ super.getSize();
            return string;
        }
    }
}
