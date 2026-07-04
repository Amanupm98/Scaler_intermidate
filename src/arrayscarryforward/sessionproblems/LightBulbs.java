package arrayscarryforward.sessionproblems;
//n Light bulbs connected by a faulty wire. Every bulb has its own switch. Initial State of the bulb is given to us.
//If we toggle ith switch, it toggle all the switches on the right side.
// arr= {1,0,0,1,0}
//Bruit Force Approach
public class LightBulbs {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,0};
        int count = 0;
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]==0){
                count++;
                for(int j=i; j< arr.length; j++){
                    if(arr[j]==0){
                        arr[j]=1;
                    }else{
                        arr[j]=0;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

// Best Approach Try it later after watching video lecture


