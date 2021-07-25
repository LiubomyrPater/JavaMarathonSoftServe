package sprint_2_Inherintance_Polymorphism.task_2;

import java.util.HashMap;
import java.util.Map;

public class Espresso extends Caffee{

    public Espresso(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink(){
        return new HashMap<String, Integer>(){{
            put("Water", 50);
            put("Arabica", 20);
        }};
    }
}
