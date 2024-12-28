class SumOfSubMatrices {
    long subMatrixSum(int arr[][], int N, int M, int X1, int Y1, int X2, int Y2) {
        // code here
        int[][] prefix = new int[N + 1][M + 1]; // 1-based indexing
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                prefix[i][j] = arr[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        // Step 2: Compute the sum of the submatrix
        int sum = prefix[X2][Y2];
        if (X1 > 1) sum -= prefix[X1 - 1][Y2];
        if (Y1 > 1) sum -= prefix[X2][Y1 - 1];
        if (X1 > 1 && Y1 > 1) sum += prefix[X1 - 1][Y1 - 1];

        return sum;
    }
}