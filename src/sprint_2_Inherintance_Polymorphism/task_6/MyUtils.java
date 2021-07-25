package sprint_2_Inherintance_Polymorphism.task_6;

import sprint_2_Inherintance_Polymorphism.task_3.Person;
import sprint_2_Inherintance_Polymorphism.task_3.Student;
import sprint_2_Inherintance_Polymorphism.task_3.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {

        List<Shape> result = new ArrayList<>();
        if (!(Objects.isNull(shapes))){
            if (shapes.isEmpty()){
                return result;
            }else if (shapes.size() == 1){
                if (shapes.get(0) instanceof Rectangle || shapes.get(0) instanceof Circle){
                    return shapes;
                }else {
                    return result;
                }
            }else {
                result.addAll(shapes.stream()
                        .distinct()
                        .filter(x -> x instanceof Circle)
                        .map(x -> (Circle)x)
                        .filter(x -> x.getArea() ==
                                shapes.stream()
                                        .filter(y -> y instanceof Circle)
                                        .map(Shape::getArea)
                                        .max(Double::compareTo)
                                        .get())
                        .collect(Collectors.toList()));

                result.addAll(shapes.stream()
                        .distinct()
                        .filter(x -> x instanceof Rectangle)
                        .map(x -> (Rectangle)x)
                        .filter(x -> x.getArea() ==
                                shapes.stream()
                                        .filter(y -> y instanceof Rectangle)
                                        .map(Shape::getArea)
                                        .max(Double::compareTo)
                                        .get())
                        .collect(Collectors.toList()));
            }
        }
        return result;
    }
}
