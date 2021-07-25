package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main_5 {
    public static void main(String[] args) {

        Map<String, Stream<String>> streamMap = new HashMap<String, Stream<String>>(){{
            put("TEST", Stream.of("   ", "  ", "      ", ""));
            put("TEST2", Stream.of("", "", "", ""));
            put("Desktop", Stream.of("iVan", "PeTro", " Ira"));
            put("Web", Stream.of("STepan", "ira", "Andriy", "an na"));
            put("Spring", Stream.of("iVan", "Anna"));
            put("_test", null);
            put(null, Stream.of(null, "Anna999999999", "Anna"));
        }};


        MyUtils.nameList(streamMap).forEach(System.out::println);

    }
}
