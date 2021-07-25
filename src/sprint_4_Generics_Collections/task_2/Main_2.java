package sprint_4_Generics_Collections.task_2;

import java.util.*;

public class Main_2 {
    public static void main(String[] args){
        MyUtils.Student s1 = new MyUtils.Student(1, "Ivan");
        MyUtils.Student s2 = new MyUtils.Student(2, "Petro");
        MyUtils.Student s3 = new MyUtils.Student(3, "Stepan");

        MyUtils.Student s4 = new MyUtils.Student(3, "Ivan");
        MyUtils.Student s5 = new MyUtils.Student(3, "Petro");
        MyUtils.Student s6 = new MyUtils.Student(3, "Stepan");

        List<MyUtils.Student> students1 = new ArrayList<>();
        students1.add(null);
        students1.add(s2);
        students1.add(s3);

        List<MyUtils.Student> students2 = new ArrayList<>();
        students2.add(s4);
        students2.add(s5);
        students2.add(s6);

        System.out.println(new MyUtils().commonStudents(students1, students2));
    }
}
