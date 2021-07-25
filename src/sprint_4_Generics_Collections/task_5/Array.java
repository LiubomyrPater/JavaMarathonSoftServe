package sprint_4_Generics_Collections.task_5;

public class Array<T> {

    private T[] array;


    public Array(T[] array){
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public int length(){
        return array.length;
    }
}
