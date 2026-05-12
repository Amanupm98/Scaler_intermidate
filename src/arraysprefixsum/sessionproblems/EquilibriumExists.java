package arraysprefixsum.sessionproblems;

/*Given an array, return true if there exists an equilibrium index in array.
Equilibrium Index => sum of LHS elements == Sum of RHS elements (Excluding index)*/

import java.util.Arrays;

public class EquilibriumExists {
    public static void main(String[] args) {

        int[] arr = {20,4,4,8,8};
        int[] psarr = new int[arr.length];
        createPrefixSumArray(psarr, arr);
        boolean isEquilibrium = isEquilibrium(psarr);
        System.out.println(isEquilibrium);

    }

    private static boolean isEquilibrium(int[] psarr) {
        int sumL;
        int sumR;
        for(int i=0; i<psarr.length-1; i++){
            if(i==0){
                sumL = 0;
            }
            else {
                sumL = psarr[i-1];
            }
            if(i==psarr.length-1){
                sumR= 0;
            }
            else {
                sumR = psarr[psarr.length-1] - psarr[i];
            }
            if(sumL==sumR){
                return true;
            }
        }
        return false;
    }

    private static void createPrefixSumArray(int[] psarr, int[] arr) {
        psarr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            psarr[i] = psarr[i-1]+ arr[i];
        }
    }
}
