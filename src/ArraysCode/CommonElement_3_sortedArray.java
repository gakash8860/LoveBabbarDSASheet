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
        List<Integer> result = new ArrayList<>();


        int i = 0, j = 0, k = 0;


        while (i < n1 && j < n2 && k < n3) {

            if (A[i] == B[j] && B[j] == C[k]) {

                if (result.isEmpty() || result.get(result.size() - 1) != A[i]) {
                    result.add(A[i]);
                }
                i++;
                j++;
                k++;
            }

            else if (A[i] < B[j]) {
                i++;
            }

            else if (B[j] < C[k]) {
                j++;
            }

            else {
                k++;
            }
        }

        return result;
    }

}
