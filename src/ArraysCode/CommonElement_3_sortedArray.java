package ArraysCode;

import java.util.ArrayList;

public class CommonElement_3_sortedArray {
    public static void main(String[] args) {

        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(A,B,C));
    }



    public static ArrayList<Integer> commonElements(int A[], int B[], int C[])
    {
        // code here
        ArrayList<Integer> common = new ArrayList<Integer>();
//        int A[] = {2, 4, 8};
//        int B[] = {2, 3, 4, 8, 10, 16};
//        int[] C = {4, 8, 14, 40};
        int x = 0, y = 0, z = 0;
        while (x < A.length && y < B.length && z < C.length){
            if (A[x] == B[y] && B[y] == C[z]){
                common.add(A[x]);
                x++;
                y++;
                z++;
            }
            else if (A[x] < B[y])
                x++;
            else if (B[y] < C[z])
                y++;
            else
                z++;
        }
        return common;
    }
}
