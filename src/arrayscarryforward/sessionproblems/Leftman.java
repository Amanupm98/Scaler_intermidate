package arrayscarryforward.sessionproblems;
// Build an Array Leftman, such that liftman[i]: max value in the given array from 0 to i
// Array -> {-3,6,2,4,5,2,8,-9,3,1}
// Leftman -> {-3,6,6,6,6,6,8,8,8,8}
// TC -> O(N)
// SC -> O(N)


import java.util.Arrays;

public class Leftman {
    public static void main(String[] args) {
        int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
        int[] result = new int[arr.length];
        System.out.println(Arrays.toString(findLeftman(arr, result)));
    }

    private static int[] findLeftman(int[] arr, int[] result) {
        result[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            result[i] = max(result[i-1],arr[i]);
        }
        return result;
    }

    private static int max(int i, int i1) {
        if(i>i1){
            return i;
        }else {
            return i1;
        }
    }
}
