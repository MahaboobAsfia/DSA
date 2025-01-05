class PredictWinner {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        // DP table to store the score difference: dp[i][j] is the best score difference Player 1 can achieve over Player 2
        int[][] dp = new int[n][n];

        // Base case: when i == j, the only option is to take the single element
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        // Fill the table for subarrays of increasing length
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                // If Player 1 takes nums[i], Player 2 gets the best from (i + 1, j)
                // If Player 1 takes nums[j], Player 2 gets the best from (i, j - 1)
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }

        // If the best score difference Player 1 can achieve is >= 0, they can win
        return dp[0][n - 1] >= 0;

    }
}