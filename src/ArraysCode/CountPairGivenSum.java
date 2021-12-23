package ArraysCode;

public class CountPairGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        System.out.println(getPairCount(arr,6));
    }
    public static int getPairCount(int[]arr,int k){
        int min =arr[0];
        int count = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]+min ==k){
                count++;
                min = arr[i];
            }
        }
        return count;
    }
}
