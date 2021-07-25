package sprint_6_Functional_Interfaces_Lambda.task_5;

import java.util.Set;
import java.util.function.Predicate;

public class MyUtils {

    static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicates){
        return predicates.stream().reduce(Predicate::and).get();
    }

}
