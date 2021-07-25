package sprint_2_Inherintance_Polymorphism.task_5;

public class Main {
    public static void main(String[] args) {

        Rectang r = new Rectang(2,5);
        Square s = new Square(7);

        test(r);
    }

    private static void test(Rectang r){
        System.out.println(r.getPerimeter());
    }


    static class Rectang {

        private double height;
        private double width;

        public Rectang(double height, double width){
            this.height = height;
            this.width = width;
        }

        public final double getPerimeter(){
            return 2*(height+width);
        }
    }


    static class Square extends Rectang {
        public Square(double width){
            super(width, width);
        }
    }
}







