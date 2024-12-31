class  MaxCircularSubarraySum {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        // Step 1: Find maximum subarray sum using Kadane's algorithm
        int maxKadane = kadane(arr);

        // Step 2: Find total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Step 3: Find minimum subarray sum using inverted array and Kadane's
        int[] invertedArray = new int[n];
        for (int i = 0; i < n; i++) {
            invertedArray[i] = -arr[i];
        }
        int minKadane = kadane(invertedArray);
        int maxCircular = totalSum + minKadane; // Subtract negative minKadane

        // Step 4: Handle edge case where all elements are negative
        if (maxCircular == 0) {
            return maxKadane;
        }

        // Step 5: Return the maximum of both cases
        return Math.max(maxKadane, maxCircular);
    }

    // Helper function to implement Kadane's algorithm
    private static int kadane(int[] arr) {
        int maxEndingHere = arr[0], maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}