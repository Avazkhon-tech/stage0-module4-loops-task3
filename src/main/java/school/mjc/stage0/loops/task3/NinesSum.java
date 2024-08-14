package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int lastNine = 9;
        int sumNines = 0;
        for (int i = 0; i <lengthOfLastNumber; i++) {
            sumNines += lastNine;
            lastNine = lastNine * 10 + 9;
        }
        System.out.println(sumNines);
    }
}
