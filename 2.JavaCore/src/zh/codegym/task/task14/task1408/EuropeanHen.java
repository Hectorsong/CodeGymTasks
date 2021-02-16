package zh.codegym.task.task14.task1408;

class EuropeanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 30;
    }
    @Override
    public String getDescription(){
        String string = super.getDescription() +
                String.format("我来自%s。我每个月下 %d 个蛋。" ,
                        Continent.EUROPE, this.getMonthlyEggCount());
        return string;
    }
}
