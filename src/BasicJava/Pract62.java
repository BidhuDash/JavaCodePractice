package BasicJava;

public class Pract62 {

    public static void main(String[] args) {

        String a = " BidhBhusanDash";

        // find the number of vowels in the given String

        char[] aa = a.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < aa.length - 1; i++) {
            if (aa[i] == 'a' || aa[i] == 'e' || aa[i] == 'i' || aa[i] == 'o' || aa[i] == 'u') {
                count++;
            }
        }

        System.out.println("the total number of vowels in the given string is :" + count);

        // for making class as Final
        DEMO d= new DEMO("007");
        String getid = d.getID();
        System.out.println("The DEMO ID we got as :"+getid);
    }
}

final class DEMO{
    private final String ID;
    public DEMO(String id){
        this.ID =id;
    }

    public String getID(){
        return ID;
    }
}
