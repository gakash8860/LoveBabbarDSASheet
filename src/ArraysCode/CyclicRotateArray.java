package ArraysCode;

public class CyclicRotateArray {
    static int arr[] = new int[]{1, 2, 3, 4, 5};



    public static void main(String[] args) {
        rotate();
        printArray(arr,arr.length);
    }
    public static void rotate(){
        int x = arr[arr.length-1],i;
        for ( i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
            arr[0] = x;

    }
    static void rotate1()
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }

    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
