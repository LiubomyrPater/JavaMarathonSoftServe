package sprint_1_Class_Design_Encapsulation.task_6;

public class Product{

    private String name;
    private double price;

    private static int count = 0;
    {count++;}


    public Product(){}

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public static int count(){
        return count;
    }

}
