package zh.codegym.task.task15.task1530;

public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("拿一个杯子装茶");
    }

    @Override
    void addIngredients() {
        System.out.println("添加茶叶");
    }

    @Override
    void pour() {
        System.out.println("注入沸水");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
