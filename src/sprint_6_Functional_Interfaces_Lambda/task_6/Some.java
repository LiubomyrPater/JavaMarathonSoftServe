package sprint_6_Functional_Interfaces_Lambda.task_6;


@FunctionalInterface
interface Some {

    boolean authorize(int val);

    default boolean authorize(String value) {
        return true;
    }

    default boolean authorize2(String value) {
        return true;
    }
}