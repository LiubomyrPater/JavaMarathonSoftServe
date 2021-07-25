package sprint_4_Generics_Collections.task_5;

import java.util.stream.IntStream;

public class ArrayUtil {
    public static double averageValue(Array<? extends Number> array){
        return IntStream.range(0, array.length()).mapToDouble(i -> array.get(i).doubleValue()).sum() / array.length();
    }

    /*public static double averageValue(Array<? extends Number> array){
        double sum = 0.0;
        for (int i = 0; i < array.length(); i++)
            sum += array.get(i).doubleValue();
        return sum / array.length();
    }*/
}
