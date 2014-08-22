package LeetCode;

/**
 */
public class MaxSum {
    public int maxSubArray(int[] A) {
        int sum = Integer.MIN_VALUE;
        if (A.length > 0) {
            int currSum = A[0];
            sum = currSum;
            for (int i = 1; i < A.length; i++) {
                currSum = Math.max(A[i], currSum + A[i]); //[-3,1]
                sum = Math.max(currSum, sum);
            }
        }
        return sum;
    }
}
