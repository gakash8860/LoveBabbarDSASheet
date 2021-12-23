package ArraysCode;

import java.util.Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

public class Minimum_NumberOfJumps {
    public static void main(String[] args) {
       int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        // your code here
        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;
        if (arr.length == 1){
            return 0;
        }else  if (arr[0] == 0){
            return -1;
        }else {
            for (int i = 1; i<arr.length;i++){
                if (i == arr.length-1){
                    return jump;
                }
                maxR = Math.max(maxR,i+arr[i]);
                step--;
                if (step == 0){
                    jump++;
                    if (i>=maxR){
                        return -1;
                    }
                    step = maxR-i;
                }
            }
        }

            return step;


    }
}

