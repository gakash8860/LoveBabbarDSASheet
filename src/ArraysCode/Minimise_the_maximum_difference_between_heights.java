package ArraysCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimise_the_maximum_difference_between_heights {
    public static void main(String[] args) {
        int[] arr =  {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int  K = 5, N = 10;
        System.out.println(getMinDiff(arr,N,K));
    }
  public static   int getMinDiff(int[] arr, int n, int k) {
        // code here
      int max = 0;
      int min = 0;
      for (int i = 0; i < arr.length; i++){
          int ans = arr[i] - k;

          if (ans <= 0){

              ans = 0;
              ans = k+arr[i];
              arr[i] = ans;
          }else {
              arr[i] = ans;
          }
      }

      System.out.println("Before "+Arrays.toString(arr));
      Arrays.sort(arr);
//      System.out.println("After "+Arrays.toString(arr));
      max = arr[arr.length-1];
      min = arr[0];
      int diff  = max - min;
      return diff;
    }
}
