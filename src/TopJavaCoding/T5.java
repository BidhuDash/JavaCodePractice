package TopJavaCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class T5 {

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

        ArrayList<T13_EmployeeComparison> emplist = new ArrayList<>();
        emplist.add(new T13_EmployeeComparison("Bidhu","Dash",26,200056.34));
        emplist.add(new T13_EmployeeComparison("Bhavesh","Chandan",36,2235.34));
        emplist.add(new T13_EmployeeComparison("Subhas","Kar",71,13045.56));
        emplist.add(new T13_EmployeeComparison("Don","Bosko",52,67056.40));
        emplist.add(new T13_EmployeeComparison("Round","Caliper",21,90766.13));

        System.out.println(emplist);
        emplist.sort(Collections.reverseOrder());
        System.out.println("After sorting using comparable:-");
        //System.out.println(emplist);
        emplist.forEach(System.out::println);


        //using comparator
        ArrayList<T13_EmployeeComparison> emplst1 = new ArrayList<>(emplist);
        //emplst1.sort(Comparator.comparing(T13_EmployeeComparison::getSalary));

        Collections.reverseOrder(Comparator.comparing(T13_EmployeeComparison::getAge));
        System.out.println("After comparison using comparator");
        emplst1.forEach(System.out::println);



    }
}
