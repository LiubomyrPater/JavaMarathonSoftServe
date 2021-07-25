package sprint_2_Inherintance_Polymorphism.task_5;

public class Main_5 {
    public static void main(String[] args) {

        Rectang r = new Rectang(2,5);
        Square s = new Square(7);

        test(s);
    }

    private static void test(Rectang r){
        System.out.println(r.getPerimeter());
    }
}


