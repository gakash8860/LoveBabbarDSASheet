package ArraysCode;

import java.util.HashMap;

public class PairSum {
    static int[] arr = {5,4,2,2,3};

    public static void main(String[] args) {
        System.out.println(checkPair_On(7,arr.length));
    }

    static int checkPair_OnSquare(int target){
        int pair = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++)
                if (arr[i]+arr[j] == target){
                    pair++;
                }

        }
        return pair;
    }

    static int checkPair_On(int sum,int n){

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }


}
