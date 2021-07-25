package sprint_4_Generics_Collections.task_6;

import java.util.Arrays;
import java.util.Comparator;

public class Utility {
    public static <T extends Person> void sortPeople(T[] people, Comparator<? super T> comparator){
        Arrays.sort(people, comparator);
    }
}
