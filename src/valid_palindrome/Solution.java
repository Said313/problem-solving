package valid_palindrome;

public class Solution {

    public static void main(String[] args) {
        String s = "+  face-=g ecaf ;";
        System.out.println("Is \"" + s + "\" valid palindrome? - " + (isPalindrome(s) ? "yes" : "no"));
    }

    public static Boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;


        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));
                if(leftChar != rightChar) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }

        return true;
    }
}
