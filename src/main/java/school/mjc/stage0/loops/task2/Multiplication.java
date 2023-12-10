package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int a=0;
        if (multiplyByAndToInclusive==0)return;
        while(((a<0)?-a:a)<=25){
            System.out.println(a);
            a+=multiplyByAndToInclusive;
        }
    }
}
