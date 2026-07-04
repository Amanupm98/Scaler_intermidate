package arrayssubarray.sessionproblems;

public class PrintSumOfEverySubArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 3, 12, -2, 15};
        printSumEverySubArrays(arr);
    }

    private static void printSumEverySubArrays(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length;j++){
                sumSubarrays(arr, i, j);

            }
        }
    }

    private static void sumSubarrays(int[] arr, int start, int end) {
        int sum = 0;
        for(int i=start; i<=end; i++ ){
            sum = sum + arr[i];
        }
        System.out.print(sum + ",");
    }
}
