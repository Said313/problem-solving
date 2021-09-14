package maximum_subarray;

public class Solution {

    public static void main(String[] args){
        int[] testArray = {-3,-2,0,-1};

        System.out.println("Maximum subarray sum: " + maximumSubarray(testArray));
    }

    public static int maximumSubarray(int arr[]){
        int max_so_far = arr[0];
        int max_ending = 0;

        for(int i = 0; i < arr.length; ++i){
            max_ending += arr[i];
            if(max_ending > max_so_far) max_so_far = max_ending;
            if(max_ending < 0) max_ending = 0;
        }

        return max_so_far;
    }
}