package TopJavaCoding;

public class Test {
    public static void main(String[] args) {
        String N = "01";
        StringBuilder CON = new StringBuilder();
        CON.append(N.charAt(0));

        int count =0;
        if(N.length()<2){
            throw new IllegalArgumentException("The number of characters should be more than one");
        }
        for (int i = 1; i < N.length(); i++) {
            if (N.charAt(i) == CON.charAt(CON.length() - 1)) {
                CON.append(N.charAt(i) == '0' ? '1' : '0');
                count++;
            }
            CON.append(N.charAt(i));

        }
        if(CON.length()==N.length()){
            CON.append(CON.charAt(CON.length()-1)=='0'?'1':'0');
            count++;
        }

        System.out.println(CON+"\n"+count);
    }
}

