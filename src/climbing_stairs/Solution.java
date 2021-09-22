package climbing_stairs;

public class Solution {

    public static void main(String[] args) {
        System.out.println("climbStairs(5) = " + climbStairs(5));
        System.out.println("climbStairs(45) = " + climbStairs(45));
    }

    public static int climbStairs(int n) {
        int[] ans = new int[46];
        ans[1] = 1;
        ans[2] = 2;

        for(int i = 3; i < 46; i++)
            ans[i] = ans[i - 1] + ans[i - 2];

        return ans[n];
    }
}
