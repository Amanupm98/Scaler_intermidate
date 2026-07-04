package arrayssubarray.sessionproblems;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 3, 12, -2, 15};

        printALlSubArrays(arr);

    }

    public static void printALlSubArrays(int[] arr) {

        for (int Start = 0; Start < arr.length; Start++) {
            for (int end = Start; end < arr.length; end++) {
                printSubarrays(arr, Start, end);
            }
        }
    }

    public static void printSubarrays(int[] arr, int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}


