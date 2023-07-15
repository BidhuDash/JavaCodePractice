package BasicJava;

public class Pract38 {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,2,3,5,4,2,5,3,2,5,6};

        for(int i:a){
            System.out.print(i+",");
        }

        Pract38 ob= new Pract38();
        int j=5;  //user defined input
        int[] b = ob.findOccurance(a);
        System.out.print(j+" count is:-");
        for(int i=0;i<a.length;i++){
            if(j==a[i]){
                System.out.print(b[i]);
                return;
            }
        }
        System.out.println("number not available");
    }

    int[] findOccurance(int[] a){
        int pointer,j=0;
        int[] b = new int[a.length];
        while (j<a.length){
            pointer = a[j];
            int count = 0;
            for (int k : a) {
                if (pointer == k) {
                    count++;
                }
            }
            b[j]=count;
            j++;
        }
        return b;
    }
}
