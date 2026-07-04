package arrayssubarray.sessionproblems;
//Print all the values of given sub Array
public class PrintAllValuesOfSubArray {
    public static void main(String[] args) {
        int arr[] = {4,2,10,3,12,-2,15};
        int start = 2;
        int end = 6;

        printSubarrays(arr,start,end);
    }

    private static void printSubarrays(int[] arr, int start, int end) {

       for(int i=start; i<=end; i++){
           System.out.print(arr[i]+ ",");
       }
    }
}
