package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_6;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 Create a Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) method of the MyUtils class
 to build a Map of all phone numbers.
 The key of Map is code of network and value contains sorted list of phones.

 Remove all spaces, brakets and dashes from phone numbers.

 For example, for a given

 [["093 987 65 43", "(050)1234567", "12-345"],
 ["067-21-436-57", "050-2345678", "0939182736", "224-19-28"],
 ["(093)-11-22-334", "044 435-62-18", "721-73-45"]]

 you should get

 {"050"=["1234567", "2345678"],
 "067"=["2143657"],
 "093"=["1122334", "9182736", "9876543"],
 "044"=["4356218"],
 "loc"=["2241928", "7217345"],
 "err"=["12345"]}
 */
public class MyUtils {
    public static Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
        return list.stream()
                .flatMap(Function.identity())
                .filter(Objects::nonNull)
                .map(x -> x.replaceAll("[^\\d]", ""))
                .filter(x -> !x.isEmpty())
                .map(x -> x.length() <= 7
                        ? x.length() == 5
                        ? String.format("%s%s", "err", x)
                        : String.format("%s%s", "loc", x)
                        : x
                )
                .distinct()
                .sorted()
                .collect(Collectors.toMap(x -> x.substring(0, 3), x -> Stream.of(x.substring(3)), Stream::concat));
    }
}
