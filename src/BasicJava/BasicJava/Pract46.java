package BasicJava.BasicJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pract46 {
    public static void main(String[] args) {
        Pract46 obj = new Pract46();
        Calculate cal = (a,b)->a + b; // lambda expression
        Calculate cal1 = (a,b)-> a-b; //
        Calculate cal2 = Integer::max;
        //method reference:- it is an alternate of lambda expression introduced in java8

        System.out.println("Max between the integers "+cal2.calculate(78,65));
        System.out.println("addition of the integers "+cal.calculate(8,9));
        System.out.println("Subtraction of the integers "+cal1.calculate(78,6));
        System.out.println("--------------------");
        obj.list();
        System.out.println("\n--------------------");
        obj.map();
        System.out.println("--------------------");
    }
    public void list(){
        List<String> ls = new ArrayList<>();
        ls.add("Bidhu");
        ls.add("Bhusan");
        ls.add("Dash");

        ls.forEach(item-> System.out.print(item+" "));
    }

    public void map(){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1, "Bidhu");
        mp.put(2,"Bhusan");
        mp.put(3,"Dash");

        mp.forEach((key,value)->System.out.println(key+":"+value));
        mp.replace(3,"boom");
        System.out.println("--------------------");
        mp.forEach((key,value)-> System.out.println((key+":"+value)));
    }
}

// functional Interface :- an interface having only one abstract method.
interface Calculate{
    int calculate(int a, int b);
}
