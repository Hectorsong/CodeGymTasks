package zh.codegym.task.task18.task1828;

/* 
价格 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Product{
        private int id;
        private String name;
        private String price;
        private String quantity;

        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getPrice() {
            return price;
        }
        public String getQuantity() {
            return quantity;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPrice(String price) {
            this.price = price;
        }
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public Product(int id, String name, String price, String quantity){
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
    public static void main(String[] args) throws IOException {
        if (args[0].length() == 0) return;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        List<Product> productList = new ArrayList<>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            while (fileReader.ready()){
                Product product = getProduct(fileReader.readLine());
                productList.add(product);
            }
        }

        switch (args[0]){
            case "-u":{
                int id = Integer.parseInt(args[1]);
                //取name
                String name = "";
                for (int i = 2; i < args.length - 2; i++) {
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
                Product productToUpdate = null;
                for (Product product : productList) {
                    if (product.getId() == id) productToUpdate = product;
                }
                if (productToUpdate != null){
                    productToUpdate.setName(name);
                    productToUpdate.setPrice(price);
                    productToUpdate.setQuantity(quantity);
                }
                break;
            }
            case "-d":{
                int id = Integer.parseInt(args[1]);
                Product productToUpdate = null;
                for (Product product : productList) {
                    if (product.getId() == id) productToUpdate = product;
                }
                if (productToUpdate != null){
                    productList.remove(productToUpdate);
                }
                break;
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : productList) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }

    public static Product getProduct(String string){
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
