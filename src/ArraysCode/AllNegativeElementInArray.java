package ArraysCode;

public class AllNegativeElementInArray {
    public static void main(String[] args) {
        int[] arr ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;;
            int arr1[] = negative(arr,n);
            printArray(arr1, arr1.length);
    }
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static int[] negative(int[]arr,int size){
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]<0){
                if (i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
