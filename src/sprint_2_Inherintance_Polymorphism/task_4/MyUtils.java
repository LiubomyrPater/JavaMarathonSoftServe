package sprint_2_Inherintance_Polymorphism.task_4;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Employee> largestEmployees(List<Employee> workers) {
        List<Employee> result = new ArrayList<>();
        if (!Objects.isNull(workers) && !workers.isEmpty()) {
            if (workers.size() == 1) {
                return workers;
            } else {
                List<Employee> employees = workers.stream().filter(x -> !(x instanceof Manager)).collect(Collectors.toList());
                List<Employee> managers = workers.stream().filter(x -> (x instanceof Manager)).collect(Collectors.toList());

                result.addAll(employees.stream()
                        .filter(x -> x.getExperience() == (employees.stream()
                                .map(Employee::getExperience)
                                .max(Integer::compareTo).get()))
                        .collect(Collectors.toList()));

                BigDecimal maxPaymentEmployee = (employees.stream().map(Employee::getPayment).max(BigDecimal::compareTo).get()).setScale(2);
                result.addAll(employees.stream()
                        .filter(x -> x.getPayment().equals(maxPaymentEmployee))
                        .collect(Collectors.toList()));


                result.addAll(managers.stream()
                        .filter(x -> x.getExperience() == (managers.stream()
                                .map(Employee::getExperience)
                                .max(Integer::compareTo).get()))
                        .collect(Collectors.toList()));

                BigDecimal maxPaymentManager = (managers.stream().map(Employee::getPayment).max(BigDecimal::compareTo).get()).setScale(2);
                result.addAll(managers.stream()
                        .filter(x -> x.getPayment().equals(maxPaymentManager))
                        .collect(Collectors.toList()));
            }
        }
        return result.stream().distinct().collect(Collectors.toList());
    }
}
