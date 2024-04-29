package BasicJava;

public class Pract62 {

    public static void main(String[] args) {

        String a = " BidhBhusanDash";

        // find the number of vowels in the given String

        char[] aa = a.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < aa.length - 1; i++) {
            if (aa[i] == 'a' || aa[i] == 'e' || aa[i] == 'i' || aa[i] == 'o' || aa[i] == 'u') {
                count++;
            }
        }

        System.out.println("the total number of vowels in the given string is :" + count);

    }
}
