package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_7;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 Create a Stream<Integer> duplicateElements(Stream<Integer> stream) method of the MyUtils class to return a sorted stream
 of duplicated elements of the input stream.

 For example, for a given elements

 [3, 2, 1, 1, 12, 3, 8, 2, 4, 2]

 you should get

 [1, 2, 3]
 */
public class MyUtils {
    public static Stream<Integer> duplicateElements(Stream<Integer> stream) {
        return stream
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(x -> x.getKey())
                .sorted();
    }




}
