package arraysprefixsum.sessionproblems;

//Given an array of size n and q queries of the format s and e return the sum of elements from s to e for each query

import java.util.Arrays;

public class SumFromsToe {

    public static void main(String[] args) {

        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[] psArr = new int[arr.length];
        int s = 9;
        int e = 9;
        createPrefixSumArray(psArr, arr);

        int result = getSumForStartAndEnd(psArr, s, e);
        System.out.println(result);

    }

    private static int getSumForStartAndEnd(int[] psArr, int s, int e) {
        if(s==0){
            return psArr[e];
        }
        int result = 0;
        result = (psArr[e] - psArr[s-1]);
        return result;
    }

    private static void createPrefixSumArray(int[] psArr, int[] arr) {
        psArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }


    }

}
