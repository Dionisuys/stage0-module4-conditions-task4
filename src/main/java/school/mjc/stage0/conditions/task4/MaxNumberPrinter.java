package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNumber = 0;
        if (first >= second) {
            maxNumber = first;
        } else {
            maxNumber = second;
        }
        if (maxNumber <= third) {
            maxNumber = third;
        }
        System.out.println(maxNumber);
    }
}
