package ArraysCode;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    static int nums1[] = {1,2,3,4,5};
    static int nums2[] = {1,2,3};
    public static void main(String[] args) {
        System.out.println(unionSize());
    }

    public static int unionSize(){
        Set<Integer> set = new HashSet<>();
        for (int x:nums1){
            set.add(x);
        }
        for (int x:nums2){
            set.add(x);
        }
        return set.size();
    }
}
