package sprint_6_Functional_Interfaces_Lambda.task_1;

public class Main_1 {
    public static void main(String[] args){

        int [] ints = {1,3,7,-9,5,9,30,6};

        System.out.println(MyUtils.getCount(ints,i -> i > 2));
    }
}
