class CountGoodNumbers {
    private static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // Count of even-indexed digits
        long oddCount = n / 2;       // Count of odd-indexed digits

        long evenPower = modExp(5, evenCount, MOD);
        long oddPower = modExp(4, oddCount, MOD);

        return (int) ((evenPower * oddPower) % MOD);
    }

    // Function for modular exponentiation: (base^exp) % mod
    private long modExp(long base, long exp, int mod) {
        long result = 1;
        long current = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) { // If the current bit of exp is set
                result = (result * current) % mod;
            }
            current = (current * current) % mod; // Square the base
            exp >>= 1; // Shift exp right by 1 bit
        }

        return result;
    }
}