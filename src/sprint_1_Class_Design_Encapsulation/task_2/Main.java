package sprint_1_Class_Design_Encapsulation.task_2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.fullName = "emp1";
        emp1.salary = 1000;

        Employee emp2 = new Employee();
        emp2.fullName = "emp2";
        emp2.salary = 2000;

        Employee[] employees = new Employee[]{emp1, emp2};

        String employeesInfo = "[";

        int count = 1;
        for (Employee x : employees) {
            employeesInfo = employeesInfo.concat(String.format("{fullName: \"%s\", salary: %s}", x.fullName, x.salary));
            if(employees.length > count++){
                employeesInfo = employeesInfo.concat(", ");
            }
        }
        employeesInfo = employeesInfo.concat("]");

        System.out.println(employeesInfo);
    }
}
