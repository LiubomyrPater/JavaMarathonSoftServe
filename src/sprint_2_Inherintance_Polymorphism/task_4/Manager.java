package sprint_2_Inherintance_Polymorphism.task_4;

import java.math.BigDecimal;

class Manager extends Employee {
    private double coefficient;

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient){
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public BigDecimal getPayment() {
        return super.getPayment().multiply(BigDecimal.valueOf(coefficient)).setScale(2);
    }

    @Override
    public String toString() {
        return String.format("Manager [name=%s, experience=%d, basePayment=%s, coefficient=%s]", super.getName(), getExperience(), super.getPayment().setScale(2), coefficient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(manager.coefficient, coefficient) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(coefficient);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
