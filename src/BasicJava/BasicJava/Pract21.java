package BasicJava.BasicJava;

public class Pract21 {
    public static void main(String[] args) {
        char [] ch = {'h','e','y'};
        System.out.println(ch);

        String name = "Bidhu";
        System.out.println(name.toUpperCase());

        String name2 = "bhibhut";
        System.out.println(name.compareTo(name2));

        StringBuffer sf = new StringBuffer(name);
        System.out.println(sf);

        CharSequence chseq = "Bidhu Dash";
        System.out.println(chseq);

    }
}
