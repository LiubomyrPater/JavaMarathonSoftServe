package sprint_3_Inner_outer_class_Enum.task_2;

public class Main_2 {
    public static void main(String[] args){

        NameList.Iterator iterator = new NameList().getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
