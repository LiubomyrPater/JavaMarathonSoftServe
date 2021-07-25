package sprint_6_Functional_Interfaces_Lambda.task_4;

@FunctionalInterface
public interface DecisionMethod {
    public boolean decide(String name, int discount);
}
