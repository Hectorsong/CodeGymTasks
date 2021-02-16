package zh.codegym.task.task13.task1320;

/* 
Neo
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    public static class User implements DBObject{
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("用户名为 %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
//            return User.this;
            return this;
        }
    }
}
