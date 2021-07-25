package sprint_3_Inner_outer_class_Enum.task_1;

public class Oven {
    public static Pizza cook() {
        return Pizza.base().addCheese("Mozzarella").addMeat("Ham").addVegetable("Tomato").build();
    }
}
