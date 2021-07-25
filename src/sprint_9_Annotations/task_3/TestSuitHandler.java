package sprint_9_Annotations.task_3;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestSuitHandler {
    public static void run(Class<?> clazz){
        if (!clazz.isAnnotationPresent(TestSuite.class)){
            System.out.println(String.format("Class %s isn't annotated", clazz.getName()));
        }else {
            Map<String, Method> methods = Arrays.stream(clazz.getMethods())
                    .filter(x -> x.getParameterCount() == 0)
                    .collect(Collectors.toMap(Method::getName, Function.identity()));
            for (String m : clazz.getAnnotation(TestSuite.class).value()) {
                if (!methods.containsKey(m)){
                    System.out.println(String.format("Method with name %s doesn't exists or not public in class %s", m, clazz.getName()));
                }else {
                    System.out.println(String.format("\\t -- Method %s.%s started --", clazz.getName(), m));
                    try {
                        methods.get(m).invoke(clazz.getDeclaredConstructor().newInstance());
                    } catch (Throwable ignore){}
                    System.out.println(String.format("\\t -- Method %s.%s finished --", clazz.getName(), m));
                }
            }
        }
    }
}