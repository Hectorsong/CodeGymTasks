package zh.codegym.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishQueue().isEmpty()) {
            if (!manager.getDishQueue().isEmpty()) {       // 移出做好的菜肴
                Dish dish = manager.getDishQueue().poll();
                System.out.println("服务员已交付此餐桌的订单：" + dish.getTableNumber());
            } else {                                         // 获取新订单。
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("已从此餐桌收到订单：" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  // 走到下一个餐桌
            } catch (InterruptedException ignored) {
            }
        }
    }
}
