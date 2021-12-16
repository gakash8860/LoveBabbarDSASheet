package ArraysCode;

import java.util.Arrays;

public class Minimum_NumberOfJumps {
    public static void main(String[] args) {
       int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        // your code here


        int i = 0, count = 0;

        while (i<arr.length){
            i = arr[i];
            count++;

        }
        return count;




    }
}

