package sprint_2_Inherintance_Polymorphism.task_5;

public class Rectang {

    private double height;
    private double width;

    public Rectang(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getPerimeter(){
        return 2*(height+width);
    }
}
