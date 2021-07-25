package sprint_2_Inherintance_Polymorphism.task_4;

import java.math.BigDecimal;

class Employee {
    private String name;
    private int experience;
    private BigDecimal basePayment;

    public Employee(String name, int experience, BigDecimal basePayment){
        this.name = name;
        this.experience = experience;
        this.basePayment = basePayment;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public BigDecimal getPayment() {
        return basePayment.setScale(2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (experience != employee.experience) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return basePayment != null ? basePayment.equals(employee.basePayment) : employee.basePayment == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + experience;
        result = 31 * result + (basePayment != null ? basePayment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, experience=%d, basePayment=%s]", name, experience, basePayment.setScale(2));
    }
}
