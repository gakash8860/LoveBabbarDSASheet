package ArraysCode;

import java.util.Arrays;

public class SortArray0_1_and_2 {
    static int nums1[] = {0,2,1,2,0};

    public static void main(String[] args) {
    int[]arr = sort(nums1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] nums){
       int l = 0 , m = 0, h = nums.length-1;
        while (m < h){
            if (nums[m] == 0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
                l++;
            }

            if (nums[m] == 1){
                m++;
            }
            if (nums[m] == 2){
                int var = nums[h];
                nums[h] = nums[m];
                nums[m] = var;
//                m++;
                h--;
            }
        }
        return nums;

    }
}
