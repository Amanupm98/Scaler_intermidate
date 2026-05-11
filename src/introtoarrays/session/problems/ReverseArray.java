package introtoarrays.session.problems;


import java.util.Arrays;

// Given an array, reverse an entire array without using any extra space
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {-1,4,7,6,-2,7,8,10};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr) +",");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
