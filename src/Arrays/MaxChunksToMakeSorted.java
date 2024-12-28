class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0; // Count of chunks
        int maxSoFar = 0; // Tracks the maximum value encountered so far

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]); // Update the maximum value
            // If the maximum value equals the current index, we can form a chunk
            if (maxSoFar == i) {
                chunks++;
            }
        }

        return chunks;
    }

}