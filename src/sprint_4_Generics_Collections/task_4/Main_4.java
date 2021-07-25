package sprint_4_Generics_Collections.task_4;

public class Main_4 {
    public static void main(String[] args){
        // Print to display: 52
        Integer[] numbers = new Integer[3];
        int numberFromSecondPosition = ArrayUtil.<Integer>setAndReturn(numbers, 52, 1);
        System.out.println(numberFromSecondPosition);

        // Print to display: Hello
        String[] words = new String[3];
        String wordFromSecondPosition = ArrayUtil.<String> setAndReturn(words, "Hello", 1);
        System.out.println(wordFromSecondPosition);
    }
}
