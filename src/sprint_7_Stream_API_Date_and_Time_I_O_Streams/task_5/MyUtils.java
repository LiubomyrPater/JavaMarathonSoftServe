package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_5;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class MyUtils {
    public static Stream<String> nameList(Map<String, Stream<String>> map) {
        return map.values().stream()
                .flatMap(x -> x)
                .filter(Objects::nonNull)
                .map(x -> x.replace(" ", ""))
                .filter(x -> !x.isEmpty())
                .map(x -> String.format("%s%s", x.substring(0, 1).toUpperCase(), x.substring(1).toLowerCase()))
                .distinct()
                .sorted();
    }
}
