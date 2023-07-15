package BasicJava;
/*Inner class and class concepts*/

public class Pract42 {
    private int num1 = 10;

    public class Inn{
        private int num2 = 20;

        public int sumtwo(int a, int b){
            return a+b+a+b;
        }
        public int sum(int a, int b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        Pract42 obj = new Pract42();
        Pract42.Inn obj1 = obj.new Inn();

        System.out.println(obj.num1);
        System.out.println(obj1.num2);
        System.out.println(obj1.sumtwo(obj.num1, obj1.num2));

        System.out.println(obj1.sum(30,50));


    }
}
