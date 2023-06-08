public class Pract14 {
    public static void main(String[] args) {
        int number1 = 34; // The integer value to convert
        String binary = Integer.toBinaryString(number1);
//        int n = Integer.parseInt(binary);
//        System.out.println(n);

        int [] arr = new int [binary.length()];
        for (int i=0;i<binary.length();i++){
            arr[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int count =0;
        for(int i=0;i<arr.length;i++){

            if (arr[i]==1){
                count++;
            }
        }
        System.out.println("The number of 1's = "+count);
    }
}
