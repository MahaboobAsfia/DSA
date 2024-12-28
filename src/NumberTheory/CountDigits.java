class CountDigits {
    static int evenlyDivides(int n) {
        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
            n /= 10; // Remove the last digit
        }

        return count;
    }
}