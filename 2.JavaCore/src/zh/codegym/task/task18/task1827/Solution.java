package zh.codegym.task.task18.task1827;

/* 
价格
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                //查找最大的ID
                int id = 0;
                for (Product product : products) {
                    if (product.id > id) id = product.id;
                }
                //取name
                String name = "";
                for (int i = 1; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                //取price
                String price =  args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                //取quantity
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }

                Product product = new Product(++id, name.trim(), price, quantity);
                products.add(product);
        }

        try(FileWriter fw = new FileWriter(fileName)){
            for (Product product: products) {
                fw.write(product.toString());
                fw.write("\n");
            }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
