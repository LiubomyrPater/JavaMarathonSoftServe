package sprint_3_Inner_outer_class_Enum.task_4;

public class Main_4 {
    public static void main(String[] args){
        System.out.println(drawLine(LineType.SOLID));
    }


    public static String drawLine(LineType lineType) {
        return String.format("The line is %s type", lineType.toString().toLowerCase());
    }

    public enum LineType {
        SOLID,
        DOTTED,
        DASHED,
        DOUBLE
    }
}
