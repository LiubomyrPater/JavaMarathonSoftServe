package sprint_2_Inherintance_Polymorphism.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {


        Person p = new Person("Ivan");
        Student s1 = new Student("Petro", "University", 3);
        Worker w1 = new Worker("Andriy", "Developer", 12);
        Worker w3 = new Worker("Andriy", "Developer", 12);
        Student s2 = new Student("Stepan", "College", 4);
        Worker w2 = new Worker("Ira", "Manager", 8);
        Student s3 = new Student("Ihor", "University", 4);

        List<Person> people = new ArrayList<Person>(){{
            add(p);
            add(s1);
            add(w1);
            add(s2);
            add(w2);
            add(w3);
            add(s3);
        }};

        MyUtils myUtils = new MyUtils();
        System.out.println(myUtils.maxDuration(people).toString());

    }

}
