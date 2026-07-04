package arrayssubarray.sessionproblems;

public class PrintSumOfAllTheSubArrays {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 3, 12, -2, 15};

        printSumALlSubArrays(arr);

    }

    private static void printSumALlSubArrays(int[] arr) {
        int totalSum = 0;

        for(int start=0; start<arr.length; start++){
            int currentSum = 0;
            for(int end=start; end<arr.length;end++){

                currentSum = currentSum + arr[end];
                totalSum = totalSum + currentSum;
            }
        }
        System.out.println(totalSum);
    }
}
