package pair_sums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 3, 3};
        System.out.println("numberOfWays(" + Arrays.toString(arr) + ") = " + numberOfWays(arr, 6));
    }

    public static int numberOfWays(int[] arr, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        int count = 0;
        for(int i : arr){
            if(m.containsKey(k - i)) count += m.get(k - i);
            if(m.containsKey(i)) m.put(i, m.get(i) + 1);
            else m.put(i, 1);
        }

        return count;
    }
}
