package sprint_5_Exceptions.task_2_3;

public class Main_2 {
    public static void main(String[] args) throws Exception{
        Plant plant = new Plant("Rare", "jlkjljklkjl", "NEW");
        System.out.println(plant);

        System.out.print(Plant.tryCreatePlant("rare", "jlkjljklkjl", "NEW"));
        System.out.print(Plant.tryCreatePlant("kljlkjl", "White", "NEW"));


    }
}
