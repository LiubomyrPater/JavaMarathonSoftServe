package sprint_2_Inherintance_Polymorphism.task_3;

import java.util.Comparator;

public class Student extends Person {
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears){
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace(){
        return this.studyPlace;
    }

    public int getStudyYears(){
        return this.studyYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (studyYears != student.studyYears) return false;
        return studyPlace != null ? studyPlace.equals(student.studyPlace) : student.studyPlace == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (studyPlace != null ? studyPlace.hashCode() : 0);
        result = 31 * result + studyYears;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Student [%s, studyPlace=%s, studyYears=%d]", super.toString(), studyPlace, studyYears);
    }
}
