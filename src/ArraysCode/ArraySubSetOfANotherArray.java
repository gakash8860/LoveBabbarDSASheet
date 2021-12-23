package ArraysCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySubSetOfANotherArray {
    public static void main(String[] args) {
       long a1[] = {10, 5, 2, 23, 19};
       long a2[] = {19, 5, 3};
        System.out.println(isSubset(a1,a2,a1.length, a2.length));
    }
    public static String isSubset( long a1[], long a2[], long n, long m) {

        Set<Double> a = new HashSet<>();
        for (int i=0;i<n;i++){
            a.add((double) a1[i]);
        }
    int c = 0;
        for (int i=0;i<m;i++){
            if (a.contains(a2[i])){
                c++;
                System.out.println("asd");
            }
        }
        if (c!=0){
            return "Yes";
        }else {
            return "No";
        }

    }
}
