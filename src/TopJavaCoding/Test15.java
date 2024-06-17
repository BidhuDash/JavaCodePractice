package TopJavaCoding;
import java.util.Scanner;

/*DNA Storage
* For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
*
* Given a Binary String S of length N(N is even), find the encoded sequence.
*
* Sample input
* 4
2
00
4
0011
6
101010
4
1001
* sample Output
* A
AG
CCC
CT
* */
public class Test15 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int testRunTimes = sc.nextInt();
        int testRunTimes = 1;
        while (testRunTimes-- > 0) {
            //int inputLen = sc.nextInt();
            //String input =sc.next();

            int inputLen = 6;
            String input = "101010";
            StringBuilder FStr = new StringBuilder("CODE-");

            for (int i = 0; i < inputLen; i=i+2) {
                if (input.charAt(i) == '0' && input.charAt(i+1) == '0') {
                    FStr.append("A");
                }
                if (input.charAt(i) == '1' && input.charAt(i+1) == '1') {
                    FStr.append("G");
                }
                if (input.charAt(i) == '1' && input.charAt(i+1) == '0') {
                    FStr.append("C");
                }
                if (input.charAt(i) == '0' && input.charAt(i+1) == '1') {
                    FStr.append("T");
                }
            }
            System.out.println(FStr);
        }
    }
}

