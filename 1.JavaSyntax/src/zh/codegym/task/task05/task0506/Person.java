package zh.codegym.task.task05.task0506;

/*人
创建 Person 类。Person 类应包含 String 变量 name、int 变量 age、String 变量 address 和 char 变量 sex。
Requirements:
1. 程序不得从键盘读取数据。
2. Person 类必须包含 String 变量 name。
3. Person 类必须包含 int 变量 age。
4. Person 类必须包含 String 变量 address。
5. Person 类必须包含 char 变量 sex。
6. 该类必须包含 4 个变量。
*/

public class Person {
    //在此编写你的代码
    private String name;
    private int age;
    private String address;
    private char sex;

    public Person(){}
    public Person(String name, int age, String address, char sex){
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public char getSex(){
        return sex;
    }

    public static void main(String[] args) {

    }
}
