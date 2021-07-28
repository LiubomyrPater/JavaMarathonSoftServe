package sprint_1_Class_Design_Encapsulation.task_2;
/**1. Create an instances of Employee class named 'emp1' and 'emp2'.
 2. Set not null values for 'fullName' and 'salary' properties.
 3. Create array of Employee type with name 'employees' and add two objects created before.
 4. Create variable with name 'employeesInfo' of String type.
 5. Using a loop, iterrate across array and write to variable named 'employeesInfo' info about each employee in next fommat:
 */
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
