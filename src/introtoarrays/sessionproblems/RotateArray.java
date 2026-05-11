package introtoarrays.sessionproblems;

import java.util.Arrays;

// Given N array elements. Rotate the array from last to first by k times
public class RotateArray {

    public static void main(String[] args) {
        int[] arr= {3,-2,1,4,6,9,8};
        int k = 8;
        int size = arr.length-1;
        k = k % arr.length;
        reverseArray(arr,0, size);
        reverseArray(arr,0, k-1);
        reverseArray(arr, k, size);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int s, int e ) {
        int i= s;
        int j= e;
        while(i<=j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
}
