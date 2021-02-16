package zh.codegym.task.task13.task1322;

/* 
SimpleObject 接口
*/

public class Solution {

/*
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject{
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }
*/

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {return null;}
    }
}
