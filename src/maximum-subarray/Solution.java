public class Solution {

    public static void main(String[] args){
        int[] testArray = {-4, -1, 2, 8, -5, 1, 9, -10, -5, 7};

        System.out.println("Maximum subarray sum: " + maximumSubarray(testArray));
    }

    public static int maximumSubarray(int arr[]){
        int max_so_far = arr[0];
        int max_ending = 0;

        for(int i = 0; i < arr.length; ++i){
            max_ending += arr[i];
            if(max_ending < 0) max_ending = 0;
            else if(max_ending > max_so_far) max_so_far = max_ending;
        }

        return max_so_far;
    }
}