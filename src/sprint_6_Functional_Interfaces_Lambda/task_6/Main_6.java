package sprint_6_Functional_Interfaces_Lambda.task_6;

import java.util.Arrays;


public class Main_6 {
    public static void main(String[] args) {

        User user = new User();
        user.values.addAll(Arrays.asList(5,7,3,7,2,8,9));
        System.out.println(user.getMaxValueByCondition(x -> x > 8));

        System.out.println(MyUtils.findMaxByCondition(user.values, x -> x < 7));

        System.out.println(user.getFilterdValue(MyUtils::findMaxByCondition, x -> x > 8));


    }
}
