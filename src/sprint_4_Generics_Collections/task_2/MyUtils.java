package sprint_4_Generics_Collections.task_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyUtils {

    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (id != student.id) return false;
            return name != null ? name.equals(student.name) : student.name == null;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }


    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        return new HashSet<Student>(){{
            for(Student s : list1){
                if (list2.contains(s))
                    add(s);
            }
        }};
    }
}
