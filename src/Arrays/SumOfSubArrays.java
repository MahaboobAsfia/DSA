class SumOfSubArrays {
    public long subarraySum(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate contribution of arr[i]
            long contribution = (long) arr[i] * (i + 1) * (n - i) % mod;
            // Add contribution to the total sum
            totalSum = (totalSum + contribution) % mod;
        }

        return (int) totalSum;

    }
}
