package contiguous_subarrays;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 0, 1, 9};

        System.out.println("countSubarrays(" + Arrays.toString(arr) + ") = " + Arrays.toString(countSubarrays(arr)));
    }

    public static int[] countSubarrays(int[] arr) {
        // Write your code here
        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            int left = i - 1;
            int right = i + 1;

            while(left >= 0) {
                if(arr[left] >= arr[i]) break;
                else left--;
            }

            while(right < arr.length) {
                if(arr[right] >= arr[i]) break;
                else right++;
            }

            ans[i] = right - left - 1;
        }

        return ans;
    }
}
