package ArraysCode;

public class MaximumAndMinimumElementInArray {

    static  class  Pair{
        int max;
        int min;
    }

    public static Pair getMinMax(int[] arr){
        Pair pair = new Pair();
        if (arr.length == 1){
            pair.max = arr[0];
            pair.min = arr[0];
        }
        if (arr[0] > arr[1]){
            pair.max = arr[0];
            pair.min = arr[1];
        }else{
            pair.max = arr[1];
            pair.min = arr[0];
        }
        for (int i = 2; i<arr.length;i++){
            if (arr[i] > pair.max){
                pair.max = arr[i];
            }else if (arr[i] < pair.min) {
                pair.min = arr[i];
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        Pair pair = new Pair();
        int[] arr={45,85,69,4,12,78};
        pair = getMinMax(arr);
        System.out.println(max(arr));
        System.out.println(minimum(arr));



        System.out.println("Minimum Element is "+pair.min);
        System.out.println("Maximum Element is "+pair.max);
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
