package TopJavaCoding;

public class T11_PrimeRange {

    public static void main(String[] args) {

        int num = 12;
        System.out.println(isPrime(num));

        primeRange(10,50);
    }

    public static void primeRange(int a,int b){
        //int count=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
