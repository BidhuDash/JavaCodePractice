import java.util.Scanner;

public class Pract8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();  // starting degree in celcius
        int e = sc.nextInt();  // ending degree in celcius
        int w = sc.nextInt();  // steps increase

        for(int i= s;i<=e;i+=w){
            double fah = ftoc(i);
            if(fah>=0)
                System.out.println(i+"\t"+(int)Math.floor(fah));
            else
                System.out.println(i+"\t"+(int)Math.ceil(fah));
        }
    }

    public static double ftoc(int f){
        return (double) ((f - 32) * 5) /9;
    }
}
