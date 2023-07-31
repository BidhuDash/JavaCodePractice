package BasicJava.BasicJava;

import java.util.Locale;

public class Pract27 {
    public static void main(String[] args) {
        String a = "Bidhuddhaddhudhudhue";
        System.out.println(a.lastIndexOf("dhu"));
        /* It will provide the last index of the provided character/character sequence/string in
        * the given string. */

        System.out.println(a.lastIndexOf("dhu",18));
        /* It will return the last index of the given character/character sequence/ string pattern
        * in the given string within the given index number. */

        System.out.println(a.toUpperCase());
       // Locale lc = Locale.CHINESE;
        System.out.println(a.toLowerCase(Locale.GERMAN));
        System.out.println("dash".toUpperCase());
        /* This function will change the given string to either upper case or lower case using the
        * provided Locale or the format.*/

        //System.out.println(a.formatted("dhu"));

        char [] b = a.toCharArray();
        for(int i=a.length()-1;i>0;i--){
            System.out.print(b[i]+" ");
        }

    }
}
