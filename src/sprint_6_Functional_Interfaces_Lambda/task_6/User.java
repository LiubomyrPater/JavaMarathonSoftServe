package sprint_6_Functional_Interfaces_Lambda.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class User {
    public final List<Integer> values = new ArrayList<>();

    int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> function, Predicate<Integer> predicate){
        return function.apply(values, predicate);
    }

    int getMaxValueByCondition(Predicate<Integer> predicate) {
        return getFilterdValue(MyUtils::findMaxByCondition, predicate);
    }
}
