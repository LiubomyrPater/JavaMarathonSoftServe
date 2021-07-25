package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_1;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class Main_1 {
    public static void main(String[] args){
        System.out.println(isLeapYear(2021));
    }

    public static boolean isLeapYear(int year) {
        return LocalDate.of(year,1,1).isLeapYear();

        //return IsoChronology.INSTANCE.isLeapYear(year);
        //return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
