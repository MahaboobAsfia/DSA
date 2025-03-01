class MaxProductInSubArray {
    public int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize variables
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If the current number is negative, swap currentMax and currentMin
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update currentMax and currentMin
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update maxProduct
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}