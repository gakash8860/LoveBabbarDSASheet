package Matrix;

import java.util.ArrayList;

public class SpiralTraversal {
    public static void main(String[] args) {
       int r = 4, c = 4;
       int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};
        System.out.println(spirallyTraverse(matrix,r,c));
    }
   public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> l= new ArrayList<>();
        //top print
        int top=0 , bottom= matrix.length-1;
        int left =0 , right= matrix[0].length-1;

        while(true){

            if(left>right)break;
            //print top;
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;
            //print right
            if(top>bottom)break;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);

            }
            right--;
            //print bottom
            if(left>right)break;
            for(int i=right;i>=left;i--){
                l.add(matrix[bottom][i]);
            }
            bottom--;
            //print left
            if(top>bottom)break;
            for(int i=bottom;i>=top;i--){
                l.add(matrix[i][left]);

            }
            left++;
        }

        return l;
    }
}
