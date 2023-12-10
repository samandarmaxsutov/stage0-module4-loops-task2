package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        int s=1;
        System.out.println(s);
        for (int i = 1; i <=printToInclusive; i++) {
            s=s*i;
            System.out.println(s);
        }
    }
}
