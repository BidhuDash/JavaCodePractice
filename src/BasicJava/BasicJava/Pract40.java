package BasicJava.BasicJava;

import java.util.Random;

public class Pract40 {

        private static final String CHARACTERS = "0123456789";
        private static final int OTP_LENGTH = 6;

        public static String generateOTP() {
            StringBuilder otp = new StringBuilder(OTP_LENGTH);
            Random random = new Random();

            for (int i = 0; i < OTP_LENGTH; i++) {
                int index = random.nextInt(CHARACTERS.length());
                otp.append(CHARACTERS.charAt(index));
            }

            return otp.toString();
        }

        public static void main(String[] args) {
            String otp = generateOTP();
            System.out.println("Generated OTP: " + otp);
        }
}