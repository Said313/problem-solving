package are_anagrams;

public class Solution {

    public static void main(String[] args) {
        String first = "ondcse";
        String second = "second";

        System.out.println("Are \"" + first + "\" and \"" + second + "\" anagrams? - " + areAnagrams(first, second));
    }

    public static boolean areAnagrams(String first, String second) {
        if(first.length() != second.length()) return false;

        int[] chars = new int[128];

        for(int i = 0; i < first.length(); ++i) {
            chars[first.charAt(i)] += 1;
        }

        for(int i = 0; i < second.length(); ++i) {
            if(chars[second.charAt(i)] == 0) return false;
            else chars[second.charAt(i)] -= 1;
        }

        return true;
    }
}
