package sprint_2_Inherintance_Polymorphism.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        if (!(Objects.isNull(persons))){
            if (persons.isEmpty()){
                return persons;
            }else if (persons.size() == 1){
                if (persons.get(0) instanceof Student || persons.get(0) instanceof Worker){
                    return persons;
                }else {
                    return result;
                }
            }else {
                result.addAll(persons.stream()
                        .distinct()
                        .filter(x -> x instanceof Worker)
                        .map(x -> (Worker)x)
                        .filter(x -> x.getExperienceYears() ==
                                (persons.stream()
                                .filter(y -> y instanceof Worker)
                                .map(y -> ((Worker) y).getExperienceYears())
                                .max(Integer::compareTo)
                                .get()))
                        .collect(Collectors.toList()));

                result.addAll(persons.stream()
                        .distinct()
                        .filter(x -> x instanceof Student)
                        .map(x -> (Student)x)
                        .filter(x -> x.getStudyYears() == (persons.stream()
                                .filter(y -> y instanceof Student)
                                .map(y -> ((Student) y).getStudyYears())
                                .max(Integer::compareTo)
                                .get()))
                        .collect(Collectors.toList()));
            }
        }
        return result;
    }
}
