package sprint_6_Functional_Interfaces_Lambda.task_4;

import java.util.ArrayList;
import java.util.List;

class Shop {
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {
        return (int) clients.stream().filter(x -> x.decide(product, percent)).count();
    }
}
