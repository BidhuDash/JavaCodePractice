package BasicJava;

import java.util.*;

/*
 *
 *
 * Major classes that implements set interfaces are:-
 * ->HashSet
 * ->EnumSet
 * ->LinkedHashSet
 * ->TreeSet */

public class Pract50_HashSet {
    public static void main(String[] args) {
        impHashSet();
        System.out.println("\n---------------");
        impEnumSet();
        System.out.println("\n---------------");
        impLinkedHashSet();
        System.out.println("\n---------------");
        impTreeSet();

    }

    /* ->HashSet doesn't follow the insertion order.
     * ->it doesn't allow duplicates.
     * ->it allows null values*/
    public static void impHashSet() {
        Set<String> st = new HashSet<>();
        st.add("Bidhu");
        st.add("Bhusan");
        st.add("Dash");
        st.add(null);

        st.add("Bidhu");
        st.add("bhusan");
        st.add("hi");
        st.add(null);
        st.remove("bhusan");
        System.out.println(st);

        System.out.println("Iterating through the Hashset:- ");
        Iterator<String> itr = st.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    /*-> It is a specialized implementation class of set interface for the use of enumeration type.
     * -> Much faster than hashset,which is very high performance.
     * -> insertion order is not maintained while iterating.
     *
     *  NOTE:- All the elements in an enum set must come from a single enumeration type that is
     *         specified when the set is created either explicitly or implicitly. */
    public static void impEnumSet() {
        Set<em> set = EnumSet.of(em.TUESDAY, em.MONDAY, em.NUll, em.SUNDAY, em.NUll);

        System.out.println(set);

        System.out.println("Iterating through the Hashset:- ");
        for (em i : set) {
            System.out.print(i + " ");
        }
    }

    /*->It is an ordered version of hashset that implements the Doubly-LinkedList
     * ->The insertion order is maintained.
     * ->It accepts null value only once.(as it doesn't keep duplicates)    */
    public static void impLinkedHashSet() {
        Set<String> set = new LinkedHashSet<>();

        set.add("Hi");
        set.add("there");
        set.add(null);
        set.add("their");
        set.add(null);
        set.add("Hi");

        System.out.println(set);

        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    /**/
    public static void impTreeSet() {
        TreeSet<Integer> st = new TreeSet<>();

        st.add(3);
        st.add(7);
        st.add(2);
        st.add(8);
        st.add(13);

        System.out.println(st);

        Iterator<Integer> itr = st.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }

    enum em {NUll, SUNDAY, MONDAY, TUESDAY}
}
