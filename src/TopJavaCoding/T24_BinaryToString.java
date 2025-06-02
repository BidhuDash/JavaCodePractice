package TopJavaCoding;

import java.util.Scanner;

/**
 * @Author Bidhu Dash
 * @Date 22-05-2025
 * <p>
 * PS: - Given a binary string in which we need to modify the string
 * if we find two similar consecutive characters, then
 * we need to add either 0's or 1's wherever required.
 * <p>
 * exp-> inp = "1001011" // out = "101010101"
 * even convert the given binary string to its respective decimal number and visa-versa
 */

public class T24_BinaryToString {
    public static void main(String[] args) {
        String str = "10111";
        System.out.printf("The provided binary number is %s and its decimal value is %d.\n", str
                , Integer.parseInt(str, 2));

        StringBuilder newStr = new StringBuilder();
        newStr.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char current = str.charAt(i);

            if (prev == current) {
                newStr.append(prev == '0' ? '1' : '0');
            }
            newStr.append(current);
        }
        System.out.printf("The new binary number is %s and its decimal number is %d.", newStr
                , Integer.parseInt(String.valueOf(newStr), 2));

    }

    // here in this method we can find the insertion counter between two consecutive numbers
    static void insertionCounter() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int insertions = 0;
            for (int i = 0; i < N - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) insertions++;
            }
            System.out.println(insertions);
        }
    }
}
