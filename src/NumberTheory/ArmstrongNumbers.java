class ArmstrongNumbers {
    static boolean armstrongNumber(int n) {
        // Ensure n is a 3-digit number
        if (n < 100 || n > 999) {
            return false;
        }

        // Extract the digits
        int hundredsDigit = n / 100;
        int tensDigit = (n / 10) % 10;
        int unitsDigit = n % 10;

        // Compute the sum of the cubes of the digits
        int sumOfCubes = (hundredsDigit * hundredsDigit * hundredsDigit) +
                (tensDigit * tensDigit * tensDigit) +
                (unitsDigit * unitsDigit * unitsDigit);

        // Check if the sum of the cubes is equal to the original number
        return sumOfCubes == n;
    }

    public static void main(String[] args) {
        int n1 = 371;
        System.out.println(armstrongNumber(n1));  // Output: true

        int n2 = 123;
        System.out.println(armstrongNumber(n2));  // Output: false
    }
}