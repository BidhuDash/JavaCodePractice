package BasicJava;

public class Pract43 {

    private int a=90;

    Pract43(){
        //show();
        //display();

    }

    public static void show(){
        System.out.println("This is a static method call");
    }
    public void display(){
        System.out.println("This is non static method display");
    }

    public static void main(String[] args) {
        Pract43 obj = new Pract43();
        //obj.sum(obj.a,60);

        Photo ph1 = new Photo() {
            @Override
            public int sum(int a, int b) {
                return super.sum(a, b);
            }

            @Override
            public int div(int a, int b) {
                return super.div(a, b);
            }
        };

        System.out.println(ph1.sum(obj.a,60));
        System.out.println(ph1.div(ph1.sum(obj.a,60), ph1.b));


    }
}
abstract class Photo{

    public int b = 30;
    Photo (){
        System.out.println("this is a abstract class constructor");
    }

    public int sum(int a, int b){

        return a+b;
    }
    public int div(int sum,int b){
        return sum/b;
    }

    public static void display(){
        System.out.println("This is method of abstract class");
    }

    public static void main(String[] args) {
        Pract43 obj2 = new Pract43();
    }

}
