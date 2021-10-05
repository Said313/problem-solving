package reverse_to_make_equal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        int[] a = {1, 4, 8, 9};
        int[] b = {4, 9, 1, 8};

        System.out.println("areTheyEqual(" + Arrays.toString(a) + ") = " + areTheyEqual(a, b));
    }

    public static boolean areTheyEqual(int[] array_a, int[] array_b) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i : array_a) {
            if(m.containsKey(i)) m.put(i, m.get(i) + 1);
            else m.put(i, 1);
        }

        for(int i : array_b) {
            if(!m.containsKey(i) || Objects.equals(m.get(i), 0)) return false;
            else m.put(i, m.get(i) - 1);
        }

        return true;
    }
}
