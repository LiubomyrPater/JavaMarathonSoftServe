package sprint_6_Functional_Interfaces_Lambda.task_1;

import java.util.Arrays;

import java.util.function.Predicate;


public class MyUtils {
    public static int getCount(int[] integers, Predicate<Integer> predicate) {
        return (int) Arrays.stream(integers).filter(predicate::test).count();
    }
}
