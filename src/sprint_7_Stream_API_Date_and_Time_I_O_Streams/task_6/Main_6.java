package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_6 {
    public static void main(String[] args) {

        List<Stream<String>> streamList = new ArrayList<Stream<String>>(){{
            add(Stream.of("", "", ""));
            add(null);
            add(Stream.of("", null, ""));
            add(Stream.of("093 987 65 43", "(050)1234567", "12-345", "12-345"));
            add(Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28", "067-21-436-57"));
            add(Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
        }};


        //MyUtils.phoneNumbers(streamList).forEach(System.out::println);
        MyUtils.phoneNumbers(streamList)
                .forEach((k,v) -> System.out.println(k + "= " + v.collect(Collectors.joining(", "))));
    }
}
