package ArraysCode;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
       int[] nums = {3,1,3,4,2};
//       int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dup = nums[0];
        int dupFinal = 0;

        for (int i=1; i<nums.length;i++){
            if (dup == nums[i]){
                dupFinal = dup;
            }else{
                dup = nums[i];
            }
        }
        return dupFinal;
    }
    public static int findDuplicateWorst(int[] nums) {
        int dup = nums[0];
        int dupFinal = 0;

        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]==nums[j]){
                    dupFinal=nums[i];
                }
            }
        }
        return dupFinal;
    }

    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


}
