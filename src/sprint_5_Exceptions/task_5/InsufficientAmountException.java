package sprint_5_Exceptions.task_5;

public class InsufficientAmountException extends Exception {

    private double amount;

    public InsufficientAmountException(double amount) {
        super("Sorry, but you are short $" + amount);
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public double getAmount(){
        return amount;
    }

}
