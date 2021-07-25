package sprint_2_Inherintance_Polymorphism.task_4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main_4 {
    public static void main(String[] args) {


        Employee e1 = new Employee("1", 1, new BigDecimal(1000.00));
        Employee e2 = new Employee("2", 2, new BigDecimal(3000.00));
        Employee e3 = new Employee("3", 3, new BigDecimal(3000.00));
        Employee e4 = new Employee("4", 5, new BigDecimal(4000.00));
        Employee e5 = new Employee("5", 5, new BigDecimal(2500.00));


        Manager m1 = new Manager("11", 6, new BigDecimal(1000.00), 1.0);
        Manager m2 = new Manager("12", 5, new BigDecimal(1000.00), 2.0);
        Manager m3 = new Manager("13", 8, new BigDecimal(1000.00), 3.0);
        Manager m4 = new Manager("14", 10, new BigDecimal(1000.00), 4.0);
        Manager m5 = new Manager("15", 10, new BigDecimal(1000.00), 4.0);


        MyUtils myUtils = new MyUtils();
        System.out.println(myUtils.largestEmployees(new ArrayList<Employee>(){{
            add(e1);
            add(e2);
            add(e3);
            add(e4);
            add(e5);

            add(m1);
            add(m2);
            add(m3);
            add(m4);
            add(m5);
        }}));

        //System.out.println("[Employee [name=Ivan, experience=10, basePayment=3000.00], Manager [name=Petro, experience=9, basePayment=3000.00, coefficient=1.5], Employee [name=Ihor, experience=5, basePayment=4500.00]]");



    }
}
