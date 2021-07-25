package sprint_8_Multithreading.task_1;

import java.util.function.BinaryOperator;

public class ParallelCalculator implements Runnable{

    public int result;
    private int operand2;
    private BinaryOperator<Integer> operator;

    public ParallelCalculator(BinaryOperator<Integer> operator, int operand1, int operand2){
        result = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    @Override
    public void run() {
        result = operator.apply(result, operand2);
    }
}
