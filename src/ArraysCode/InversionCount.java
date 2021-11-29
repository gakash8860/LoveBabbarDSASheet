package ArraysCode;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {4,1,21,13};
        int ans = checkSort(arr);
        System.out.println(ans);
    }
    public static int checkSort(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>arr[i+1]){
               ans =swap(arr);
            }
        }
        return ans;
    }
    public static int swap(int[] arr){
        int count = 0;
        int i=0,j = arr.length,temp = 0;
        while (i<j){
             temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            count++;
            i++;
            j--;
        }
        return count;
    }
}
