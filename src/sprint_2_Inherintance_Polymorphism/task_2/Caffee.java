package sprint_2_Inherintance_Polymorphism.task_2;

import java.util.HashMap;
import java.util.Map;

public class Caffee implements DrinkPreparration, DrinkReceipt, Rating {
    private String name;
    private int rating;
    private Map<String, Integer> ingredients;

    public Caffee(String name, int rating){
        this.name = name;
        this.rating = rating;
        this.ingredients = new HashMap<>();
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 100)
                .addComponent("Arabica", 20);
        return ingredients;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public int getRating(){
        return rating;
    }

    @Override
    public final DrinkReceipt addComponent(String componentName, int componentCount){
        ingredients.put(componentName, componentCount);
        return this;
    }
}
