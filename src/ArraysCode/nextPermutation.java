package ArraysCode;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String args[]){
        int [] ar = {4,6,5};
    nextPermutationFunc(ar);

    }
    public static void nextPermutationFunc(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j =nums.length-1;
            while(j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums,int start){

        int j=nums.length-1;
        while(start<j){
            swap(nums,start,j);
            start++;
            j--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
