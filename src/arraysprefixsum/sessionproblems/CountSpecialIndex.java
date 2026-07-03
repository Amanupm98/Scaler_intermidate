package arraysprefixsum.sessionproblems;

//Given an array count the number of special index in array
//Special Index -> An index in the array after removing which sum of all odd index elements == sum of all even indexed elements (in resulting array)

import java.util.Arrays;

public class CountSpecialIndex {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,6,-2};
        int[] evenPrefixSum = evenPrefixSum(arr);
        int[] oddPrefixSum = oddPrefixSum(arr);


    }

    private static int[] evenPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(i%2==0){
                prefixSum[i] = prefixSum[i-1] + arr[i];
            }else{
                prefixSum[i] = prefixSum[i-1];
            }
        }
        return prefixSum;
    }

    private static int[] oddPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = 0;
        for(int i=1; i<arr.length; i++){
            if(i%2!=0){
                prefixSum[i] = prefixSum[i-1] + arr[i];
            }else{
                prefixSum[i] = prefixSum[i-1];
            }
        }

    return prefixSum;


    }


}
