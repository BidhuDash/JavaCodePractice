package TopJavaCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestClass {

    public static void main(String[] args) {

        String str = " How are you techie";
        String[] st = str.trim().split("\\s");

        for (String s : st) {
            System.out.print(s.charAt(0)+" ");
        }

        /*Singleton singleton;
        singleton = Singleton.getInstance();
        singleton.show();

        Singleton singleton1;
        singleton1 = Singleton.getInstance();
        singleton1.show();*/

        /*Singleton singleton;
        System.out.println(singleton.s);*/
        System.out.println();

        ArrayList<Emp_Comparison> emplist = new ArrayList<>();
        emplist.add(new Emp_Comparison("Bidhu","Dash",26,200056.34));
        emplist.add(new Emp_Comparison("Bhavesh","Chandan",36,2235.34));
        emplist.add(new Emp_Comparison("Subhas","Kar",71,13045.56));
        emplist.add(new Emp_Comparison("Don","Bosko",52,67056.40));
        emplist.add(new Emp_Comparison("Round","Caliper",21,90766.13));

        System.out.println(emplist);
        emplist.sort(Collections.reverseOrder());
        System.out.println("After sorting using comparable:-");
        //System.out.println(emplist);
        emplist.forEach(System.out::println);


        //using comparator
        ArrayList<Emp_Comparison> emplst1 = new ArrayList<>(emplist);
        //emplst1.sort(Comparator.comparing(Emp_Comparison::getSalary));

        Collections.reverseOrder(Comparator.comparing(Emp_Comparison::getAge));
        System.out.println("After comparison using comparator");
        emplst1.forEach(System.out::println);



    }
}
