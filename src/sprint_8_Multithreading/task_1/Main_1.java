package sprint_8_Multithreading.task_1;

public class Main_1{
    public static void main(String[] args) {

        Runnable PC1 = new ParallelCalculator((a, b) -> a * b, 2, 4);
        Runnable PC2 = new ParallelCalculator((a, b) -> a - b, 2, 4);

        Thread t1 = new Thread(PC1);
        Thread t2 = new Thread(PC2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(((ParallelCalculator) PC1).result);
        System.out.println(((ParallelCalculator) PC2).result);
    }

}
