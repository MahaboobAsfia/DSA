class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); // Convert list to set for fast lookups
        int n = s.length();

        // dp[i] represents whether the substring s[0...i-1] can be segmented into words
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: empty string can always be segmented

        // Fill the DP array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further if dp[i] is true
                }
            }
        }

        return dp[n]; // Can the entire string be segmented?

    }
}