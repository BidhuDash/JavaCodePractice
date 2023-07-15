package BasicJava;
import java.util.Scanner;
// reverse the string keeping the words at its position

public class Pract29_Imp_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse:-");
        String a = sc.nextLine();
        //System.out.println(a);

        System.out.print("The output String is:-");
        System.out.println(reverseStringAtSamePlace(a));

    }

    public static StringBuffer reverseStringAtSamePlace(String a){

        StringBuffer str = new StringBuffer();
        String[] b = a.trim().split("\\s");
        for(int i=b.length-1;i>=0;i--){
            str.append(b[i]).append(" ");
        }
        str.reverse();   // reverse the given string
        str.deleteCharAt(0);   // this will delete the first character which has space appended
        return str;
    }
}
