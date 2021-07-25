package sprint_2_Inherintance_Polymorphism.task_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public static Map<String, Double> averageRating(List<Caffee> coffees) {
        return coffees.stream()
                .collect(Collectors.groupingBy(Caffee::getName, Collectors.averagingDouble(Caffee::getRating)));
    }
}
