class LcmAndGcd {
    public static int[] lcmAndGcd(int a, int b) {
        // Compute GCD using Euclidean algorithm
        int gcd = findGCD(a, b);

        // Compute LCM using the relationship LCM * GCD = a * b
        int lcm = (a / gcd) * b;

        // Return the result as an array [LCM, GCD]
        return new int[]{lcm, gcd};
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}