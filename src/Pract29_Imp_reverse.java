import java.util.Scanner;
// reverse the string keeping the words place at its position

public class Pract29_Imp_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse:-");
        String a = sc.nextLine();

        String [] ab = a.trim().split("\\s");
        System.out.print("The given String is:-");
        for(String i:ab){
            System.out.print(i+" ");
        }
        StringBuffer sbr = new StringBuffer();
        System.out.print("\n"+"The output String is:-");
        for(int i=ab.length-1;i>=0;i--){
            sbr.append(ab[i]).append(" ");
        }
        sbr.reverse();   // reverse the given string
        sbr.deleteCharAt(0);  // this will delete the first character which has space appended
        System.out.println(sbr);

    }
}
