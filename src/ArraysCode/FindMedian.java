package ArraysCode;

import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
       int arr[] = {90 ,100 ,78 ,89 ,67,4};
        System.out.println(find_median(arr));
    }
    public static int find_median(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        if (n % 2 != 0)
            return (int)v[n / 2];

        return (int)(v[(n - 1) / 2] + v[n / 2]) / 2;

    }
}
