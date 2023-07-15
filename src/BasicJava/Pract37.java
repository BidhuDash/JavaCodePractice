package BasicJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//collection framework
public class Pract37 {
    /* Collection interface extends iterable interface, whereas  list,queue & set interfaces extends
        collection interface.
    * */
    public static void main(String[] args) {

        List<String> lst = new ArrayList<String>();
        lst.add("add");
        lst.add("into");
        lst.add("this");

        List<String> ls = new ArrayList<String>();
        Collections.addAll(lst, "list","fully");
        lst.remove("this");
        ls.addAll(0,lst);
        ls.removeAll(lst);

        System.out.println("after removing this from the list "+lst);
        System.out.println("list of elements in ls "+ls);
        int a = lst.size();
        System.out.println(a);

        //lst.clear();
        System.out.println("Lst is empty:-"+lst);

        System.out.println(lst.contains("this"));

    }

}
