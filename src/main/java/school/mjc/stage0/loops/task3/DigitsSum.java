package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int length = Integer.toString(t).length() - 1;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
