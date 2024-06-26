package ArraysCode;

public class LargestSumOfContigousSubArray {
   static int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
    public static void main(String[] args) {
        int n = maxSubArraySum();
        System.out.println(n);
    }
    public static int maxSubArraySum(){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i=0; i<a.length; i++){
            max_ending_here = max_ending_here+a[i];
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
