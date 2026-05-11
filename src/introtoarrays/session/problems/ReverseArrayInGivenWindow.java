package introtoarrays.session.problems;

import java.util.Arrays;

// GIven N array elements & s and e, reverse the array in range [s,e]
public class ReverseArrayInGivenWindow {

    public static void main(String[] args) {

        int[] arr = {-3,4,2,8,7,9,6,2,10};
        int s = 3; // index of array
        int e = 7; // index of array
        reverseArray(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int s, int e) {
        int i = s;
        int j = e;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
