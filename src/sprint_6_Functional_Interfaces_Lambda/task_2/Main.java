package sprint_6_Functional_Interfaces_Lambda.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] doubles = new double[] {1, 2, 3, 5.01, 8.3, 9.06};

        System.out.println(Arrays.toString(App.getChanged(doubles, App.cons)));
        System.out.println(Arrays.toString(doubles));

    }
}
