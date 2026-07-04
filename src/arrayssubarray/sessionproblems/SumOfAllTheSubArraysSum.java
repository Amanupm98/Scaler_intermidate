package arrayssubarray.sessionproblems;
//Find the sum of all the sub arrays sum
//optimized

public class SumOfAllTheSubArraysSum {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 2, 6};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + ((i+1)*(arr.length - i))*arr[i];
        }
        System.out.println(sum);
    }
}
