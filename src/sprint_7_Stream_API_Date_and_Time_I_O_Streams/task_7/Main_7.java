package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_7;

import java.util.stream.Stream;

public class Main_7 {

    public static void main(String[] args) {

        MyUtils.duplicateElements(Stream.of(3, 3, 3, 2, 2, 1, 1, 12, 3, 8, -2, 4, -2, -1, -1)).forEach(System.out::println);

    }
}
