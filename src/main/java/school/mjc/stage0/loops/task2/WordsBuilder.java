package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String a = "";
        int i = 0;
        while (i < chars.length ) {
            a=a+chars[i];
            i++;
        }
        System.out.print(a);
    }
}
