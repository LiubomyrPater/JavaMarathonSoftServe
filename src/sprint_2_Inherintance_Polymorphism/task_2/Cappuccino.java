package sprint_2_Inherintance_Polymorphism.task_2;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino extends Caffee {

    public Cappuccino(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink(){
        return new HashMap<String, Integer>(){{
            put("Water", 100);
            put("Arabica", 20);
            put("Milk", 50);
        }};
    }
}
