package sprint_3_Inner_outer_class_Enum.task_2;

public class NameList {

    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator(){
        return new Iterator();
    }

    public class Iterator{
        private int counter = 0;
        public boolean hasNext(){
            return counter < names.length;
        }
        public String next(){
            return names[counter++];
        }
    }
}
