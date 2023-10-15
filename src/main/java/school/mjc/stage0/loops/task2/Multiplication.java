package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int counter = 0;
        if (multiplyByAndToInclusive < 0) {
            int swap = multiplyByAndToInclusive;
            while (swap <= 0) {
                System.out.println(counter * multiplyByAndToInclusive);
                swap++;
                counter++;
            }
        } else {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
