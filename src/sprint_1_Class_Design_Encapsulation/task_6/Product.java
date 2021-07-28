package sprint_1_Class_Design_Encapsulation.task_6;
/**Create a Product class with fields name of type String and price of type double.

 The Product class must meet the following principles:

 All class fields must be private.
 Get and set methods must be used to access the class fields.
 The class must have a constructors with and without parameters.
 In the Product class write count() static method that returns count of created objects of Product type.*/
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
