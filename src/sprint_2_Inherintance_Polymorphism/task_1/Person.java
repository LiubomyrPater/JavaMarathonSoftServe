package sprint_2_Inherintance_Polymorphism.task_1;

public class Person{
    int age;
    String healthInfo;
    String name;

    public Person(int age, String healthInfo, String name){
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
    }

    public String getHealthStatus(){
        return name + " " + healthInfo;
    }
}

class Child extends Person{
    private String childIDNumber;

    public Child(int age, String healthInfo, String name, String chilIDNumber){
        super(age, healthInfo, name);
        this.childIDNumber = childIDNumber;
    }
}

class Adult extends Person{
    private String passportNumber;

    public Adult(int age, String healthInfo, String name, String passportNumber){
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }
}
