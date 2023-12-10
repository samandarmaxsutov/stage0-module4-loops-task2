package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    private boolean checkForPRimeNUmber(int n){
        int i=2;
        while(i<n){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        int i=2;

        while(i<=printToInclusive){
            if (checkForPRimeNUmber(i)) System.out.println(i);
            i++;
        }
    }
}
