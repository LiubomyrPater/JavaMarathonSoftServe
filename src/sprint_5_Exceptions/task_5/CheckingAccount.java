package sprint_5_Exceptions.task_5;

class CheckingAccount {


     /**
     Please, create a class for the exception
     (automatically enforced by the Handle or Declare Rule)
     that is used in the code below so that it will compile without errors:



     The output of the doOperations invocation looks like this:
     Sorry, but you are short $200.0
     Please, deposit at least $200.0
     **standard stack trace output**
     */


    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientAmountException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            throw new InsufficientAmountException(amount - balance);
        }
    }

}
