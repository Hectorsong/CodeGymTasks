package zh.codegym.task.task13.task1327;

public class Person implements TurnipItem {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void pull(Person second) {
        System.out.println(name + "在" + second.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

