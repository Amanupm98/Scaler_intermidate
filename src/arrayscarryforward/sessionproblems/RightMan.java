package arrayscarryforward.sessionproblems;

import java.util.Arrays;

import static java.lang.Math.max;

// Build an Array RightMan, such that RightMan[i]: max value in the given array from i to 0
// Array ->    {-3,6,2,4,5,2,8,-9,3,1}
// RightMan -> {8,8,8,8,8,8,8,8,3,3,1}
// TC -> O(N)
// SC -> O(N)
public class RightMan {
    public static void main(String[] args) {
        int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
        int[] result = new int[arr.length];
        System.out.println(Arrays.toString(findRightMan(arr, result)));
    }
    private static int[] findRightMan(int[] arr, int[] result) {
        result[result.length-1]=arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--){
            result[i]=max(result[i+1],arr[i]);
        }
        return result;
    }
}
