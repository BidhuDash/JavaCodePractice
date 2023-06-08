

public class Pract26 {
    public static void main(String[] args) {
        String a = "This   is   Me";
       // System.out.println(a.replaceAll("\\S+","$"));
        char [] cr = a.toCharArray();
        for(int i:cr){
            System.out.print(i+" ");
        }
        System.out.println("-----------------");
        String [] ab = a.split("\\s+");
        for (String i:ab){
            System.out.print(i+" ");
        }
        System.out.println("--------------------");
        System.out.println("print the reverse of the string");
        char ch;
        String reversestr ="";
        for (int i=0;i<a.length();i++){
            ch =a.charAt(i);
            reversestr =ch + reversestr;
        }
        System.out.println(reversestr);

    }
}
