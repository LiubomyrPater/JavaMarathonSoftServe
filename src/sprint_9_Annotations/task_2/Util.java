package sprint_9_Annotations.task_2;


import java.time.LocalDate;

/**
 This annotation can be applied to class when we execute static method review(String className)
 of class Util and the result of this method will be printed Class <ClassName> was reviewed <date in format yyyy-mm-dd>
 by <reviewer> to standard output (console).
 If the class <className> isn’t annotated we show message: Class <ClassName> isn't marked as Reviewed.
 If the class was not found we show message: Class <ClassName> was not found.
 */

@Review(reviewer = "Pater Liubomyr")
public class Util {
    public static void review(String className){
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println(!clazz.isAnnotationPresent(Review.class)
                    ? String.format("Class %s isn't marked as Reviewed", className)
                    : String.format("Class %s was reviewed %s by %s.", className,
                    !clazz.getAnnotation(Review.class).date().equals("today")
                            ? clazz.getAnnotation(Review.class).date()
                            : LocalDate.now(),
                    clazz.getAnnotation(Review.class).reviewer()));
        } catch (ClassNotFoundException e) {
            System.out.println(String.format("Class %s was not found", className));
        }
    }
}