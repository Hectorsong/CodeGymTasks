package zh.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        if(args == null || args.length < 1){
            throw new RuntimeException();
        }

        Date birthdayDate;
        Person person;
        switch (args[0]){
            case "-c":
                birthdayDate = simpleDateFormat.parse(args[3]);
                if (args[2].equals("m")){
                    person = Person.createMale(args[1] , birthdayDate);
                }else person = Person.createFemale(args[1] , birthdayDate);
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                birthdayDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if(person == null){
                    throw new IllegalArgumentException();
                }
                if (args[3].equals("m")){
                    allPeople.set(id, Person.createMale(args[2], birthdayDate));
                }else if (args[3].equals("f")){
                    allPeople.set(id, Person.createFemale(args[2], birthdayDate));
                }
/*
                Person printPerson1 = allPeople.get(Integer.valueOf(args[1]));
                System.out.println(printPerson1.getName() + " " + (printPerson1.getSex()==Sex.MALE?"m":"f") + " "
                        + simpleDateFormat2.format(printPerson1.getBirthDate()) );
*/
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.valueOf(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
            case "-i":
                Person printPerson = allPeople.get(Integer.valueOf(args[1]));
                System.out.println(printPerson.getName() + " " + (printPerson.getSex()==Sex.MALE?"m":"f") + " "
                        + simpleDateFormat2.format(printPerson.getBirthDate()) );
                break;
        }
    }
}
