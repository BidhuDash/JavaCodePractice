package BasicJava;
//Print all possible substring of a given string

public class Pract31_Substring {
    public static void main(String[] args) {
        String a = "abccddeffg";
        //char[] b = a.toCharArray();

        for(int i =0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
}
