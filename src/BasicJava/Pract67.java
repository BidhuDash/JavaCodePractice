package BasicJava;

public class Pract67 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        for( int i:a){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
