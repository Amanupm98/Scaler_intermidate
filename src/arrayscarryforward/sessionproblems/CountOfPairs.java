package arrayscarryforward.sessionproblems;
//Given char array of lower case, Return the count of pairs(i,j) such that i < j
// S[i]='a',S[j]='g' => 'ag'
// array  = {b,c,a,g,g,a,a,g}

//Bruite Force Approch
public class CountOfPairs {
    public static void main(String[] args) {
        char[] arr = {'b','c','a','g','g','a','a','g'};
        int result = countOfPairss(arr);
        System.out.println(result);
    }

    //My Approch
    private static int countOfPairs(char[] arr) {
        int pairs = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]=='a' && arr[j]=='g'){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    //Bit better approch By Scaler
    private static int countOfPair(char[] arr) {
        int ans = 0 ;
        for(int i=0; i<arr.length;i++){
            if(arr[i]=='a'){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[j]=='g'){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }


    //Optimize Approch

    private static int countOfPairss(char[] arr) {
        int countOfa = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
             if(arr[i]=='a'){
                 countOfa++;
             }
             if(arr[i]=='g'){
                 ans = ans + countOfa;
             }

        }
        return ans;
    }


}

