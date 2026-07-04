package arrayssubarray.sessionproblems;
// Print sum of all the values of sub array
public class SumAllValuesOfSubArray {
    public static void main(String[] args) {
        int arr[] = {4,2,10,3,12,-2,15};
        int start = 2;
        int end = 6;

       int sum = sumSubarrays(arr,start,end);
        System.out.println(sum);
    }

    private static int sumSubarrays(int[] arr, int start, int end) {
        int sum = 0;
        for(int i=start; i<=end; i++ ){
            sum = sum + arr[i];
        }
        return sum;
    }
}

