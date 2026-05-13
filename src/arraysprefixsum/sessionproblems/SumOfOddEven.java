package arraysprefixsum.sessionproblems;

import java.util.Arrays;

/*Given an array and q queries
(s,e,O) -> sum of all odd index elements
(s,e,E) -> sum of all even index elements
from [s,e]
*/
public class SumOfOddEven {

    public static void main(String[] args) {
        int[] arr = {2,3,1,-1,0,8,5,4};
        int s = 3;
        int e = 6;
        char EvenOdd = 'O';
        int sum=0;
        int[] oddPrefixSum;
        int[] evenPrefixSum;
        evenPrefixSum = createPrefixSumEven(arr);
        oddPrefixSum  = createPrefixSumOdd(arr);
        sum = findSum(s,e,EvenOdd,oddPrefixSum,evenPrefixSum);
        System.out.println(sum);

    }

    private static int findSum(int s, int e, char evenOdd, int[] oddPrefixSum, int[] evenPrefixSum) {
        if(evenOdd=='O'){
            if(s==0){
                return oddPrefixSum[e];
            }
            return oddPrefixSum[e]-oddPrefixSum[s-1];
        }
        else{
            if(s==0){
                return evenPrefixSum[e];
            }
            return evenPrefixSum[e]-evenPrefixSum[s-1];
        }
    }

    private static int[] createPrefixSumOdd(int[] arr) {
        int [] result = new int[arr.length];
        result[0]=0;
        for (int i=1; i<arr.length;i++){
            if(i%2!=0){
                result[i]=result[i-1] + arr[i];
            }else{
                result[i]=result[i-1];
            }
        }
        return result;
    }

    private static int[] createPrefixSumEven(int[] arr) {
        int[] result = new int[arr.length];
        result[0]=arr[0];
        for(int i=1; i<arr.length;i++){
            if(i%2==0){
                result[i]=result[i-1] + arr[i];
            }else{
                result[i]=result[i-1];
            }
        }
        return result;
    }
}
