package zh.codegym.task.task17.task1715;

import java.util.HashMap;
import java.util.Map;

public class DrugController {

    public volatile static Map<Drug, Integer> allDrugs = new HashMap<>();   // 药品, 数量>

    static {
        Drug acetaminophen = new Drug();
        acetaminophen.setName("扑热息痛");
        allDrugs.put(acetaminophen, 5);

        Drug metamizole = new Drug();
        metamizole.setName("安乃近");
        allDrugs.put(metamizole, 18);

        Drug placebo = new Drug();
        placebo.setName("安慰剂");
        allDrugs.put(placebo, 1);
    }

    public synchronized void sell(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if ( !(allDrugs.get(drug)>0) ) {
            System.out.println("缺货");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s 需 要%d 片 %s。有货：%d", name, count, drug.getName(), currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s 购买了 %d 片 %s。剩余：%d", name, count, drug.getName(), (currentCount - count)));
        }
    }

    public synchronized void buy(Drug drug, int count) {
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        System.out.println(Thread.currentThread().getName() + " 购买：" + count + " " + drug.getName() + "剩余：" + (currentCount - count));
        allDrugs.put(drug, (currentCount + count));
    }
}