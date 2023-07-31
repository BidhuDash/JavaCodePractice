package BasicJava.BasicJava;

import java.util.Scanner;

//Print the number of words in a given string
public class Pract24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int output = countWords(str);
        System.out.println(output);
    }

    static int countWords(String str){
        int countWord=0;
        for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' ' || str.charAt(i) == 'a'){
                    countWord+=1;
                }
            }
        return countWord;
    }
}
