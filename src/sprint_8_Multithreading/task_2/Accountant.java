package sprint_8_Multithreading.task_2;

import sprint_8_Multithreading.task_1.ParallelCalculator;

public class Accountant {
    public static int sum(int x, int y){
        Runnable action = new ParallelCalculator(((a, b) -> a + b), x, y);
        Thread t = new Thread(action);
        try {
            t.start();
            t.join();
        } catch (Throwable ignore) {}
        return ((ParallelCalculator) action).result;
    }
}
