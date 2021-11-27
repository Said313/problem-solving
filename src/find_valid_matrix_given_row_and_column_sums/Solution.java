package find_valid_matrix_given_row_and_column_sums;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] rowSum = {3, 8};
        int[] colSum = {4, 7};

        int[][] ans = restoreMatrix(rowSum, colSum);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;

        int[][] ans = new int[m][n];

        while(true) {
            int rowIndex = getIndexOfSmallestExceptZero(rowSum);
            int colIndex = getIndexOfSmallestExceptZero(colSum);

            if(rowIndex == -1) break;

            int valToSet = Math.min(rowSum[rowIndex], colSum[colIndex]);
            ans[rowIndex][colIndex] = valToSet;
            rowSum[rowIndex] -= valToSet;
            colSum[colIndex] -= valToSet;
        }

        return ans;
    }

    private static int getIndexOfSmallestExceptZero(int[] arr) {
        int smallestValueExceptZero = Integer.MAX_VALUE;
        int indexOfSmallest = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && smallestValueExceptZero > arr[i]) {
                smallestValueExceptZero = arr[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }
}
