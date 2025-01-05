class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int k, int n, int start) {
        // Base case: if the size of the combination is k and the sum is n
        if (tempList.size() == k && n == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // Iterate through numbers 1 to 9
        for (int i = start; i <= 9; i++) {
            // If the current number exceeds the remaining sum, stop further exploration
            if (i > n) break;

            tempList.add(i); // Add the current number to the combination
            backtrack(result, tempList, k, n - i, i + 1); // Recurse with the next number
            tempList.remove(tempList.size() - 1); // Remove the last number to backtrack
        }
    }
}