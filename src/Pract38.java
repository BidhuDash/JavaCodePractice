public class Pract38 {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,2,3,5};

        for(int i:a){
            System.out.println(i);
        }

    }

    int findOccurance(int[] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(max > a[i]){
               // max == a[i];
            }
        }

        return max;
    }
}
