package zh.codegym.task.task14.task1408;

/* 
鸡肉工厂
*/

import java.util.Collection;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }
    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if (continent.equals("欧洲")){
                hen = new EuropeanHen();
            }else if (continent.equals("北美洲")){
                hen = new NorthAmericanHen();
            }else if (continent.equals("亚洲")){
                hen = new AsianHen();
            }else if (continent.equals("非洲")){
                hen = new AfricanHen();
            }
            return hen;
        }
    }


}
