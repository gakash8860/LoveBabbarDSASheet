package ArraysCode;

import java.util.Arrays;

public class KthMaxAndMin {
    static int[] arr = {7 ,10 ,4 ,20 ,15};
    public static void main(String[] args) {
        System.out.println(kthSmallest(arr,2));
    }
    static int kthSmallest(int[]arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
