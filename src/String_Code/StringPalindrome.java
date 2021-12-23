package String_Code;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
    public static String isPalindrome(String s){
        if (s.length() == 0 || s.length() == 1){
            return "Yes";
        }
        if (s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return "No";
    }
}
