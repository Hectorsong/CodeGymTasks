package zh.codegym.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Manager {      // 单例模式

    private static Manager ourInstance = new Manager();

    private final List<Table> restaurantTables = new ArrayList<>(10);
    private int currentIndex = 0;

    private final Queue<Order> orderQueue = new ConcurrentLinkedQueue<>();        // 订单队列
    private final Queue<Dish> dishQueue = new ConcurrentLinkedQueue<>();     // 做好的菜肴的队列

    public synchronized static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {               // 创建 10 个餐桌
        for (int i = 0; i < 10; i++) {
            restaurantTables.add(new Table());
        }
    }

    public synchronized Table getNextTable() {           // 服务员绕圈从餐桌 1 走到餐桌 10
        Table table = restaurantTables.get(currentIndex);
        currentIndex = (currentIndex + 1) % 10;
        return table;
    }

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }

    public Queue<Dish> getDishQueue() {
        return dishQueue;
    }
}
