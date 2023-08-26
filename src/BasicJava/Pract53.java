package BasicJava;

import java.util.Optional;

public class Pract53 {
    public static void main(String[] args) {

        String[] str = new String[10];
        //String[]  str = new String[]{"B", "i", "d", "h", "u", "D", "a", "s", "h"};

        Optional<String> opt = Optional.ofNullable(str[5]);
        if(opt.isPresent()){
            String word = str[5].toLowerCase();
            System.out.println(word);
        }
        else System.out.println("String is null");

        Optional<Integer> integer = Optional.empty();


    }
}
