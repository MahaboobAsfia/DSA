class SwappingPairsMakeSumEqual {
    boolean findSwapValues(int[] a, int[] b) {

        int sumA = 0, sumB = 0;

        // Calculate sums of both arrays
        for (int num : a) sumA += num;
        for (int num : b) sumB += num;

        // Calculate the difference
        int diff = sumA - sumB;

        // If diff is not even, it's impossible to equalize sums
        if (diff % 2 != 0) return false;

        int targetDiff = diff / 2;

        // Store all elements of array b in a hash set
        HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        // Check if there exists an element in a such that
        // (a - targetDiff) exists in setB
        for (int num : a) {
            if (setB.contains(num - targetDiff)) {
                return true; // Swap found
            }
        }

        return false; // No valid swap exists
    }
}
