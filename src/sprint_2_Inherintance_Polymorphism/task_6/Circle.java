package sprint_2_Inherintance_Polymorphism.task_6;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
