package zh.codegym.task.task14.task1417;

public class Euro extends Money{
    public Euro(double amount) {
        super(amount);
    }

    /*@Override
    public double getAmount() {
        return super.getAmount();
    }*/

    @Override
    public String getCurrencyName() {
        return "EUR";
    }
}
