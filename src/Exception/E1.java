package Exception;

/**
 * @Author Bidhu Dash
 * @Date 02-06-2025
 *
 *      Exception Hierarchy Type 1
 * 
 */public class E1 {

     public static void method(){
         try{
             throw new RuntimeException();
         }
         finally {
             System.out.print("Finally ");
         }
     }

     public static void main(String[] args) {
        try{
            method();
        }
        catch (Exception e){
            System.out.print("Exception ");
        }
         System.out.println("Caught");
    }
}
