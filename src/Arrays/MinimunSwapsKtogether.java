import java.io.*;
import java.util.*;

class MinimumSwapsKtogether {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.minSwap(a, k);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Step 1: Count the numbers ≤ k
        int countOfK = 0;
        for (int num : arr) {
            if (num <= k) {
                countOfK++;
            }
        }

        // Step 2: Find the maximum count of numbers ≤ k in any window of size countOfK
        int maxCount = 0, currentCount = 0;
        for (int i = 0; i < countOfK; i++) {
            if (arr[i] <= k) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        for (int i = countOfK; i < arr.length; i++) {
            if (arr[i] <= k) {
                currentCount++;
            }
            if (arr[i - countOfK] <= k) {
                currentCount--;
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        // Step 3: Calculate minimum swaps
        return countOfK - maxCount;
    }
}
