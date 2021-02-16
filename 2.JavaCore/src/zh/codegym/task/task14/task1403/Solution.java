package zh.codegym.task.task14.task1403;

/* 
大厦和学校
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {

        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "学校";
        }
    }

    static class Building /*在此编写你的代码*/ {
        @Override
        public String toString() {
            return "大厦";
        }
    }
}
