package zh.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User、loser、coder 和 programmer
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        while (true) {
            key = reader.readLine();
            boolean u = key.equals("user") || key.equals("loser") ||
                    key.equals("coder") || key.equals("programmer");
            if (!u) break;
            switch (key){
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    break;
            }
            doWork(person); // 调用 doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }else if (person instanceof Person.Programmer){
            ((Person.Programmer) person).enjoy();
        }
    }
}
