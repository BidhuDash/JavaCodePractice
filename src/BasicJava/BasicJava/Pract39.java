package BasicJava.BasicJava;

import java.util.HashMap;
import java.util.Map;

public class Pract39 {
    void hashMapExp(){
        HashMap<Integer, String> hm = new HashMap<>();  //default constructor of hashmap
        hm.put(1,"bidhu");
        hm.put(2,"bhusan");
        hm.put(3,"dash");

        System.out.println(hm); // print all from the hashmap

        System.out.println(hm.get(2)); // print the value key wise
        System.out.println(hm.containsKey(1)); // give true or false
    }
    void hashMapExp2(){
        // parameterized constructor of hashmap with initial capacity of 10
        HashMap<Integer,String> hm = new HashMap<>(10);

        hm.put(20,"Twenty");
        hm.put(30,"thirty");
        hm.put(40,"Forty");
        hm.put(40,"fifty");   // it will replace the duplicate key with new value associated to it

        hm.put(null,"Spells");    // it can have only one null key and multiple null values
        hm.put(null,"not null");

        hm.remove(40,"fifty");     // removes the key and value associated to it
        hm.put(60,null);
        hm.put(70,null);
        hm.put(10,null);

        System.out.println(hm);
    }
    void hashMapExp3(){
        // parameterized constructor of hashmap where we can define the initial capacity and the load factor
        // [default initial capacity will be 16 and default load factor is 0.75]
        HashMap<String,Integer> hm = new HashMap<>(10,0.50f);

        hm.put("Bidhu",1);
        hm.put("bhusan",2);
        hm.put("Dash",3);

        // traversing through hashmap using Map.Entry<K,V> entry
        for(Map.Entry<String,Integer> e : hm.entrySet()) {
            System.out.println("Key:-" + e.getKey() + ",Value:-" + e.getValue());
        }
    }
    public static void main(String[] args) {
        Pract39 obj = new Pract39();
        //obj.hashMapExp();
        //obj.hashMapExp2();
        obj.hashMapExp3();

    }

}
