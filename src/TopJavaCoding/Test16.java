package TopJavaCoding;

public class Test16 {
    public static void main(String[] args) {
        String S = "BINGO";
        String T = "BIGON";
        StringBuilder M = new StringBuilder();

        for(int i=0;i< S.length();i++){
            if(S.charAt(i) == T.charAt(i)){
                M.append('G');
            }
            else{
                M.append('B');
            }
        }
        System.out.println(M);
    }
}
