package zh.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
读取并写入文件Human
*/

public class Solution {

    public static void main(String[] args) {
        // 基于硬盘上文件的路径，更新传递给 createTempFile 方法的字符串。
        try {
            File yourFile = File.createTempFile("你的文件名", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human("史密斯", new Asset("住宅", 999_999.99),
                    new Asset("汽车", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            // 检查史密斯是否等于 somePerson

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("糟糕，我的生活出现问题了");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("糟糕，save/load 方法出现问题");
        }
    }

    public static class Human {

        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() :0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            // 实现此方法
        }

        public void load(InputStream inputStream) throws Exception {
            // 实现此方法
        }
    }
}
