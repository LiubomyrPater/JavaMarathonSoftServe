package sprint_4_Generics_Collections.task_6;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.name.equals(o2.name)
                ? o1.age - o2.age
                : o1.name.compareTo(o2.name);
    }
}
