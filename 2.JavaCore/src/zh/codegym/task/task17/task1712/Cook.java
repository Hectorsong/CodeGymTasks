package zh.codegym.task.task17.task1712;

public class Cook implements Runnable {

    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (Cook.class) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("厨师正在休息");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // 厨师从队列中获取菜单。
        System.out.println(String.format("订单将在 %d 毫秒内为餐桌 %d 做好", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // 准备菜肴
        Dish dish = new Dish(order.getTableNumber());       // 这是做好的菜肴
        System.out.println(String.format("餐桌 %d 的订单已经准备好", dish.getTableNumber()));
        manager.getDishQueue().add(dish);
    }
}
