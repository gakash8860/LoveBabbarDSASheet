package ArraysCode;

import java.util.Arrays;

public class MergeTwoArrays_WithoutExtra_Space {

    static int arr1[] = new int[]{1, 3,5,7};
    static int arr2[] = new int[]{0,2,6,8,9};

    public static void main(String[] args) {
//      int [] des =  brute_Force_Merge_Using_Third_Array(arr1, arr2);
//        System.out.println(Arrays.toString(des));
        merge(arr1,arr2, arr1.length, arr2.length);


    }

    public static int[] brute_Force_Merge_Using_Third_Array(int[] s1, int[] s2) {
        int[] des = new int[s1.length + s2.length];
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] < s2[j]){
                des[k] = s1[i];
                k++;
                i++;
            }else {
                des[k] = s2[j];
                j++;
                k++;
            }



        }
        if (i < s1.length){
            while (i<s1.length){
                des[k] = s1[i];
                i++;
                k++;
            }
        }
        if (j < s2.length){
            while (j< s2.length){
                des[k] = s2[j];
                j++;
                k++;
            }
        }
        return des;
    }
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i=0,j=0,k = n-1;
        while (i <= k && j < m){
            if (arr1[i] < arr2[j]){
                i++;
            }else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Arrays.toString(arr1);
            Arrays.toString(arr2);
        }
    }
}
