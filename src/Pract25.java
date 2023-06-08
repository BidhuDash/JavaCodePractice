import java.util.Scanner;

// program to count the number of words in a given string
public class Pract25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string line to count the number of words:-");
        String name = sc.nextLine();
        //String name =" To That is what is knows as?";
        System.out.println(countWords(name));

    }
    static int countWords(String input){
        if(input== null || input.isEmpty()){
            return 0;
        }
        String [] arr = input.trim().split("\\s+");
        return arr.length;
    }

}
