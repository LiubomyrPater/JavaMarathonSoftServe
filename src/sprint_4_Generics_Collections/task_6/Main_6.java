package sprint_4_Generics_Collections.task_6;

import java.util.Arrays;

public class Main_6 {
    public static void main(String[] args){

        Person p1 = new Person("Z",23);
        Person p2 = new Person("Z",23);
        Person p3 = new Person("Z",23);
        Person [] people = {p3,p1,p2};


        System.out.println(Arrays.deepToString(people));
        Utility.sortPeople(people, new PersonComparator<>());
        System.out.println(Arrays.deepToString(people));

        System.out.println();
        System.out.println("=========================================================");
        System.out.println();

        Employee e1 = new Employee("U", 74, 5443);
        Employee e2 = new Employee("X", 34, 6445);
        Employee e3 = new Employee("T", 62, 3443);
        Employee [] employees = {e1, e2, e3};

        System.out.println(Arrays.deepToString(employees));
        Utility.sortPeople(employees, new EmployeeComparator<>());
        System.out.println(Arrays.deepToString(employees));


        System.out.println();
        System.out.println("=========================================================================================================");
        System.out.println();

        Developer d1 = new Developer("K", 27, 6354, Level.MIDDLE);
        Developer d2 = new Developer("K", 27, 6354, Level.JUNIOR);
        Developer d3 = new Developer("K", 64, 6354, Level.JUNIOR);
        Developer [] developers = {d1, d2, d3};

        System.out.println(Arrays.deepToString(developers));
        Utility.sortPeople(developers, new DeveloperComparator<>());
        System.out.println(Arrays.deepToString(developers));







    }
}
