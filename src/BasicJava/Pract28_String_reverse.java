package BasicJava;
// reverse the given string

import java.util.Scanner;

public class Pract28_String_reverse {
    static StringBuilder reverseUsingStringBuilder(String str) {
        StringBuilder bld = new StringBuilder();
        bld.append(str);
        bld.reverse();
        return bld;
    }

    static String reverseStringUsingString(String str) {
       /* StringBuilder rev = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev.insert(0, ch);
        }
        return rev.toString();*/

        String rev = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "this is bidhu dash";
//        System.out.println("Enter the string you want to reverse:-");
//        String name = sc.nextLine();
        System.out.println(reverseUsingStringBuilder(name));
        System.out.println(reverseStringUsingString(name));

        String givenStr = "Independent";
        char[] intermediate = givenStr.toCharArray();
        for(int i=intermediate.length-1;i>=0;i--){
            System.out.print(intermediate[i]+" ");
        }


        //oneliner string reverse using StringBuilder
        String newStr = new StringBuilder(givenStr).reverse().toString();
        System.out.println(newStr);

    }
}
