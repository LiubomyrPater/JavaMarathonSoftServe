package sprint_2_Inherintance_Polymorphism.task_2;

public class Main_2 {
    public static void main(String[] args) {

        Caffee caffee = new Caffee("My", 10);

        caffee.addComponent("vodka", 50);

        caffee.makeDrink();

        System.out.println(caffee.getIngredients());

    }
}
