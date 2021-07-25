package sprint_4_Generics_Collections.task_6;

public class DeveloperComparator<T extends Developer> extends EmployeeComparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return super.compare(o1, o2) == 0
                //? o1.getLevel().ordinal() - o2.getLevel().ordinal()
                ? o1.getLevel().compareTo(o2.getLevel())
                : super.compare(o1, o2);
    }
}
