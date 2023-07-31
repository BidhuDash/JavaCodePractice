package BasicJava;

public class Pract41 {

    public static void main(String[] args) {

        Pract41 obj = new Pract41();
        // obj.normalString();  // approx 4 mins 15.5 seconds
        obj.stringBuilde();  // approx 4 mins 2.02 seconds


    }

    void normalString() {
        String aa = " ";
        for (int i = 0; i <= 100000; i++) {
            aa = aa + i;
            System.out.println(aa);
        }
    }

    void stringBuilde() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            sb.append(i);
            System.out.println(sb);
        }
    }
}
