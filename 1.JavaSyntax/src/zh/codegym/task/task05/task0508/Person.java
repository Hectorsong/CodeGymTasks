package zh.codegym.task.task05.task0508;

/* 
Person 类的 getter 和 setter
*/

public class Person {
    //在此编写你的代码
    private String name;
    private int age;
    private char sex;

    public Person(){}
    public Person(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getSex(){ return sex; }

    public static void main(String[] args) {

    }
}
