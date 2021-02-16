package zh.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;
/* 
货币
*/
public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("保罗");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " 储备了 " + money.getAmount()
                    + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Euro(5000));
            allMoney.add(new Ruble(10000));
            allMoney.add(new USD(1000));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
