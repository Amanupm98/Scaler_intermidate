package introtoarrays.sessionproblems;


// Given n array elements, count number of elements having at least 1 element greater than itself.

public class CountElements {

    public static void main(String[] args) {
        int[] arr = {-3,-2,6,8,4,8,5};
        int result = 0;
        int max = findMax(arr);
        int numberOfTimes = countOfAppearance(arr,max);
        result = (arr.length-numberOfTimes);
        System.out.println(result);
    }

    private static int countOfAppearance(int[] arr, int max) {
        int count = 0;
        for(int x: arr){
            if(x==max){
                count++;
            }
        }
        return count;
    }

    private static int findMax(int[] arr) {
        int max = 0;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
