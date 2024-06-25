package TopJavaCoding;

public class Test {


    public static void main(String[] args) {
        String N = "111";
        StringBuilder CON = new StringBuilder(N);

        int T = 3;
        for(int i = 0;i<T;i=i+2){
            for(int j = i+1;j<T;j++){
                if(N.charAt(i)==N.charAt(j)){
                    if (N.charAt(j) == '1') {
                        CON.insert(i+1,'0');
                        break;}
                    if(N.charAt(j) == '0'){
                        CON.insert(i+1,'1');
                        break;}
                }
            }
        }
        System.out.println(CON);

    }
}
