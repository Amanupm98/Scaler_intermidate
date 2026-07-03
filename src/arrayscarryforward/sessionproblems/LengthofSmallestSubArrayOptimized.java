package arrayscarryforward.sessionproblems;

//Return length of smallest subarray which contain both max and min of array.
// arr={2,2,6,4,5,1,5,2,6,4,1}
// Need to do it again this code is incorrect
public class LengthofSmallestSubArrayOptimized {

    public static void main(String[] args) {
        int[] arr = {6,3,6,4,1,6,5,2,1,4,1};
        int max = max(arr);
        int min = min(arr);
        int latestMax = Integer.MAX_VALUE;
        int latestMin = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                latestMax=i;
                ans=min(ans, max(latestMax,latestMin) - min(latestMax,latestMin) + 1);
            }else if(arr[i]==min){
                latestMin=i;
                ans=min(ans, max(latestMax,latestMin) - min(latestMax,latestMin) + 1);
            }


        }
        System.out.println(ans);



    }

    private static int min(int latestMax, int latestMin) {
       return Math.min(latestMin,latestMax);
    }

    private static int max(int latestMax, int latestMin) {
        return Math.max(latestMax,latestMin);
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
