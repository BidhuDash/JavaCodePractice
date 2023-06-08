
// reverse the given string

import java.util.Scanner;

public class Pract28_String_reverse {
    static StringBuilder reverseUsingStringBuilder(String str){
        StringBuilder bld = new StringBuilder();
        bld.append(str);
        bld.reverse();
        return bld;
    }

    static String reverseString(String str){
        String rev ="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch =str.charAt(i);
            rev =ch+rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "this is bidhu dash";
//        System.out.println("Enter the string you want to reverse:-");
//        String name = sc.nextLine();
        System.out.println(reverseUsingStringBuilder(name));
        System.out.println(reverseString(name));
    }
}
