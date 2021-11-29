package ArraysCode;

public class ReverseArray {


    public static void main(String[] args) {
     int [] arr= {5,4,7,8,9};
     int[] temp = new int[arr.length];
       temp = reverseArray(arr);
        printArray(temp, temp.length);
    }
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public  static  int[]  reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
