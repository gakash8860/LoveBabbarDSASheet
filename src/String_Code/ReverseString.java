package String_Code;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[]  s = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(s)));
    }
    public static char[] reverseString(char[] s) {
        int i=0,j=s.length-1;
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}
