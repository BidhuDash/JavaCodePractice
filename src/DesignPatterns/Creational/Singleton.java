package DesignPatterns.Creational;

class Singleton {
    private static Singleton singletonInstance;
   // private static final Singleton singletonInstance = new Singleton();  // for Eager Instantiation
    public String s;

    private Singleton(){
        s = "this is a singleton class string";
        System.out.println("This is a singleton class called inside constructor");
    }

    // TYPE 1---- use this method technique for early instantiation or eager initialization
   /* public static Singleton getInstance(){
        return singletonInstance;
    }*/

    // TYPE 1(style 2)---- use this for without using getInstance()
    static{
        singletonInstance = new Singleton();
    }

    // TYPE (2)---- use this technique for lazy instantiation, or when the object is needed then it will be created
    /*public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }*/


    //Type (3)---- use this technique for thread safe singleton usage, and the performance is also slow
    /*public static synchronized Singleton threadSafeSingletonInstance(){
        if(singletonInstance==null)
            singletonInstance = new Singleton();

        return singletonInstance;
    }*/


    // Type (4)--- using this technique double-checked locking principle is achieved
   /* public static Singleton SingletonInstance() {
        if(singletonInstance==null){
            synchronized(Singleton.class) {
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }*/

    public void show(){
        System.out.println("a simple static method");
    }

    public static void main(String[] args) {
        //Singleton sg = new Singleton();
        //getInstance();
    }
}
