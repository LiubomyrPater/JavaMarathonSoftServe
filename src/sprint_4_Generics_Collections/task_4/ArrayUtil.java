package sprint_4_Generics_Collections.task_4;

public class ArrayUtil{
    public static <T>T setAndReturn(T[] array, T newValue, int position){
        return array[position] = newValue;
    }
}
