package zh.codegym.task.task15.task1530;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("拿一个杯子装拿铁");
    }

    @Override
    void addIngredients() {
        System.out.println("煮咖啡");
    }

    @Override
    void pour() {
        System.out.println("倒入泡沫牛奶");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
