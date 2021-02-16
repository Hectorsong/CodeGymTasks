package zh.codegym.task.task17.task1720;

public class ATM {

    static BankAccount account = new BankAccount("阿米戈");

    public static volatile boolean isStopped;

    public static void main(String[] args) throws InterruptedException {
        addMoney.start();
        SpendThread spendThread = new SpendThread();
        SpendThread spendThread1 = new SpendThread();
        SpendThread spendThread2 = new SpendThread();
        spendThread.start();
        spendThread1.start();
        spendThread2.start();
        Thread.sleep(4000);
        isStopped = true;
    }

    private static Thread addMoney = new Thread() {
        @Override
        public void run() {
            while (!isStopped) {
                account.deposit("1000");            // 存款
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    };

    public static class SpendThread extends Thread {

        @Override
        public void run() {
            while (!isStopped) {
                try {
                    account.withdraw("100");             // 取款
                } catch (NotEnoughMoneyException e) {
                    System.out.println("金额不足");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
