package zh.codegym.task.task17.task1707;

/* 
IMF
*/

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund);
        System.out.println(anotherFund);
        System.out.println(fund == anotherFund );
    }
}
