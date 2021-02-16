package zh.codegym.task.task14.task1405;

/* 
食物
*/

public class Solution {

    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.onSelect();
        food.onEat();
    }

    public static void selectableMethods(Selectable selectable) {
        //在此编写你的代码
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("食物被吃了");
        }

        public void onSelect(){
            System.out.println("已选择食物");
        }
    }
}
