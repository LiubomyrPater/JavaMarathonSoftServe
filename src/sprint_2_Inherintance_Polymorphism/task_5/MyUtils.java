package sprint_2_Inherintance_Polymorphism.task_5;

import java.util.List;
import java.util.Objects;

public class MyUtils {
    public double sumPerimeter(List<? extends Rectang> firures) {
        return firures.stream().filter(x -> !(Objects.isNull(x))).map(x -> ((Rectang) x).getPerimeter()).reduce(0d, Double::sum);
    }
}
