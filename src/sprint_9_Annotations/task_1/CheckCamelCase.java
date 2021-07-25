package sprint_9_Annotations.task_1;

import java.util.Arrays;


public class CheckCamelCase {
    public final static String CAMELCASE_PATTERN = "[a-z]+((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?";
    private final static String ERROR_MESSAGE_TEMPLATE = "method %s.%s doesn't satisfy camelCase naming convention\n";

    public static boolean checkAndPrint(Class clazz){
        return Arrays.stream(clazz.getMethods())
                .filter(x -> x.isAnnotationPresent(CamelCase.class) && !x.getName().matches(CAMELCASE_PATTERN))
                .peek(x -> System.out.print(String.format(ERROR_MESSAGE_TEMPLATE, clazz.getName(), x.getName())))
                .count() == 0;
    }
}