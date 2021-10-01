package merge_sorted_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 8, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 2, 4};

        merge(nums1, 3, nums2, 4);

        System.out.println("First array after merge: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int second = 0;
        while(first < m && second < n) {
            if(nums1[m - 1 - first] > nums2[n - 1 - second]) {
                nums1[m + n - 1 - first - second] = nums1[m - 1 - first];
                first++;
            } else {
                nums1[m + n - 1 - first - second] = nums2[n - 1 - second];
                second++;
            }
        }

        while(first < m) {
            nums1[m + n - 1 - first - second] = nums1[m - 1 - first];
            first++;
        }

        while(second < n) {
            nums1[m + n - 1 - first - second] = nums2[n - 1 - second];
            second++;
        }
    }
}
