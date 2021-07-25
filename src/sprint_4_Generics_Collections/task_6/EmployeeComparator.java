package sprint_4_Generics_Collections.task_6;

public class EmployeeComparator<T extends Employee> extends PersonComparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return super.compare(o1, o2) == 0
                ? Double.compare(o1.getSalary(), o2.getSalary())
                : super.compare(o1, o2);
    }
}
