package zh.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
约翰 约翰逊
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Map<String , Date> person = new HashMap<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(args[0]))){
            while(bf.ready()) {
                String[] tempArray = bf.readLine().split(" ");
                StringBuilder name = new StringBuilder();
                for (int i = 0; i < tempArray.length - 3; i++) {
                    name = name.append(tempArray[i] + " ");
                }
                Calendar calendar = new GregorianCalendar(Integer.parseInt(tempArray[tempArray.length - 1]),
                        Integer.parseInt(tempArray[tempArray.length - 3]) - 1,
                        Integer.parseInt(tempArray[tempArray.length - 2]));
                Date date = calendar.getTime();
                PEOPLE.add(new Person(name.toString().trim(), date));
            }

        }

        for (Person per: PEOPLE) {
            System.out.println(per.getName() + " " + per.getBirthDate());
        }
    }
}
