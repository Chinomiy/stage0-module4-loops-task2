package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
            return;
        }
        int counter = 1;
        int factorial = 1;
        while (printToInclusive + 1 >= counter) {
            System.out.println(factorial);
            factorial *= counter;
            counter++;
        }
    }
}
