package sprint_6_Functional_Interfaces_Lambda.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 The greetingOperator should create a new string as a result by the rule: "Hello " + parameter1 + " " + parameter2 + "!!!"

 Create a static method createGreetings(...) that takes two parameters:
 List<Person> and BinaryOperator and generates List<String> as a result.
 We should be able to pass greetingOperator as a parameter here.

 Please, use the second parameter in creating the result.
 */

public class App {

    static BinaryOperator<String> greetingOperator = (parameter1, parameter2) -> String.format("Hello %s %s!!!", parameter1, parameter2);

    public static List<String> createGreetings(List<Person> people, BinaryOperator<String> greetingOperator) {
        return new ArrayList<String>(){{
            for(Person p : people){
                add(greetingOperator.apply(p.name, p.surname));
            }
        }};
    }
}
