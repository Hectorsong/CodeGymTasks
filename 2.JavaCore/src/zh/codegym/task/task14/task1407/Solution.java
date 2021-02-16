package zh.codegym.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
乐手和舞者
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("乐者".equals(key)) {
                person = new Player();
            } else if ("舞者".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
//        System.out.println(person.getClass());
        if (person instanceof Player){
            ((Player) person).play();
        }else if(person instanceof Dancer){
            ((Dancer) person).dance();
        }
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("演奏");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("跳舞");
        }
    }
}
