package arrayscarryforward.sessionproblems;

import static java.util.Collections.min;

//Return length of smallest subarray which contain both max and min of array.
// arr={2,2,6,4,5,1,5,2,6,4,1}
//Bruite Force Approch


public class LengthofSmallestSubArray {
    public static void main(String[] args) {
        int[] arr = {2,2,6,4,5,1,5,2,6,4,1};
        int max = max(arr);
        int min = min(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]==min){
                        ans=min(ans,j-i+1);
                        break;
                    }
                }
            } else if(arr[i]==min) {
                for(int j = i+1;j<arr.length; j++){
                    if(arr[j]==max){
                        ans=min(ans,j-i+1);
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int min(int ans, int i) {
        return Math.min(ans, i);
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }


}
