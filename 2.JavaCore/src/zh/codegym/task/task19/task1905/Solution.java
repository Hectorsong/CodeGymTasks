package zh.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
巩固适配器
*/

public class Solution {

    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA", "乌克兰");
        countries.put("US", "美国");
        countries.put("FR", "法国");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> entry: countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())){
                    return entry.getKey();
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] name = contact.getName().split(", ");
            return name[1];
        }

        @Override
        public String getContactLastName() {
            String[] name = contact.getName().split(", ");
            return name[0];
        }

        @Override
        public String getDialString() {
            return "拨号：//+" + contact.getPhoneNumber().replaceAll("\\D","");
//            return null;
        }
    }

    public static interface RowItem {
        String getCountryCode();        // 例如：US
        String getCompany();            // 例如：CodeGym Ltd.
        String getContactFirstName();   // 例如：约翰
        String getContactLastName();    // 例如：彼得森
        String getDialString();         // 例如：拨号：//+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // 例如：CodeGym Ltd.
        String getCountryName();        // 例如：美国
    }

    public static interface Contact {
        String getName();               // 例如：彼得森，约翰
        String getPhoneNumber();        // 例如：+1(111)222-3333，+3(805)0123-4567，+380(50)123-4567 等
    }
}