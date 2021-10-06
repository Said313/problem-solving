package passing_yearbooks;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 12, 2, 3, 1, 7, 11, 5, 4, 9};

        System.out.println("findSignatureCounts(" + Arrays.toString(arr) + ") = " + Arrays.toString(findSignatureCounts(arr)));
    }

    public static int[] findSignatureCounts(int[] arr) {
        // Write your code here
        int[] ans = new int[arr.length];
        for(int i = 1; i <= arr.length; ++i) {

            int current = arr[arr[i - 1] - 1], count = 1;
            while(current != arr[i - 1]) {
                current = arr[current - 1];
                count++;
            }

            ans[i - 1] = count;
        }

        return ans;
    }
}
