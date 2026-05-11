package introtoarrays.session.problems;

//Given N array elements, check if there exists a pair of i,j such that arr[i]+arr[j] = k and i!=j, i and j are index values & k is the given sum.
public class PairOfIJ {
    public static void main(String[] args) {

        int[] arr = {3,-2,1,4,3,6,8};
        int target = 11;
        boolean result = false;
        result = doesPairExist(arr,target);
        System.out.println(result);
    }

    private static boolean doesPairExist(int[] arr, int target) {
        boolean output=false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                     output=true;
                     break;
                }
            }
        }
        return output;
    }
}
