package zh.codegym.task.task14.task1408;

 class AsianHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 20;
    }
    @Override
    public String getDescription(){
        String string = super.getDescription() +
                String.format("我来自%s。我每个月下 %d 个蛋。" ,
                        Continent.ASIA, this.getMonthlyEggCount());
        return string;
    }
}
