package zh.codegym.task.task13.task1323;

/* 
Screen 类中的 Updatable 接口
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    public class Screen implements Selectable , Updatable{
        @Override
        public void onSelect(){

        }

        @Override
        public void refresh() {

        }
    }
}
