package product_of_array_except_self;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 20, -11, -6, 7, 4, 6};
        System.out.println("productExceptSelf(" + Arrays.toString(arr) + ") = " + Arrays.toString(productExceptSelf(arr)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;

        int zero = -1;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == 0 && zero != -1) {
                Arrays.fill(nums, 0);
                return nums;
            } else if(nums[i] == 0) {
                zero = i;
            } else {
                totalProduct *= nums[i];
            }
        }

        for(int i = 0; i < nums.length; ++i) {
            if(zero == -1) nums[i] = totalProduct/nums[i];
            else if(zero == i) nums[i] = totalProduct;
            else nums[i] = 0;
        }

        return nums;
    }
}
