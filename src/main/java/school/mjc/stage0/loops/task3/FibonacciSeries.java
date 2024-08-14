package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
