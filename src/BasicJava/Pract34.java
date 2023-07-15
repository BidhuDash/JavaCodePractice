package BasicJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Pract34 {
    public static void main(String[] args) {
        List ab = new ArrayList(10);

        Optional op = Optional.ofNullable(ab);


        //System.out.println(op.get());
        System.out.println(op.isPresent());
        //System.out.println(op.stream().findFirst());
        System.out.println(op.orElse("This is another string"));


    }
}
