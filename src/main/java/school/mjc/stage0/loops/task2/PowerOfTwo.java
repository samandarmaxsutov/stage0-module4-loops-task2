package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0) {
            System.out.println("too much power");
            return;
        }
        int a=1,i=0;
        while (i<=power) {
            System.out.println(a);
            a*=2;
            i++;
        }
    }
}
