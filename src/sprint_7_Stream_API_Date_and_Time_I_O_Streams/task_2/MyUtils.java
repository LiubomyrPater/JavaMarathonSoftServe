package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 * Write a method to get the date n-years m-months and k-days after today using new DateTime API.
 *
 * Return the obtained date in the format ISO_LOCAL_DATE.
 */
public class MyUtils {
    public static String getDateAfterToday(int years, int months, int days) {
        return LocalDate.now().plus(Period.of(years, months, days)).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
