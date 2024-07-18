package DSA_CODES.Searching;


// time complexcity O(n)
public class LinearSearch {

    static int linSearch(int[] arr, int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,54,33,12,65,33,77};
        int key = 33;
        int indexFound = linSearch(array,key);
        System.out.println(indexFound);
    }
}
