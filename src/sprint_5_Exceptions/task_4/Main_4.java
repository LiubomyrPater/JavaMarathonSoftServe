package sprint_5_Exceptions.task_4;

public class Main_4 {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setFirstName("Liubomyr");
        p1.setLastName("Pater");
        p1.setIdCode("3178418410");

        System.out.println(p1);

        System.out.println(Person.buildPerson("Liubomyr", "Pater", "3178418410"));


    }
}
