package longest_substring_without_repeating_characters;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String s = "fiewwofnn 77";
        System.out.println("lengthOfLongestSubstring(\"" + s + "\") = " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] table = new int[128];
        Arrays.fill(table, -1);

        int max = 0;
        int start = 0;
        int l = 0;
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            int index = table[ch];
            if(index != -1 && start <= index) {
                start = index;
                if(max < l) max = l;
                l = i - start;
            } else {
                l++;
            }

            table[s.charAt(i)] = i;
        }

        return Math.max(max, l);
    }
}
