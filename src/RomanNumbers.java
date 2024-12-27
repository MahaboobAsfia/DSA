class RomanNumbers {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0; // To store the final result
        int prevValue = 0; // To keep track of the previous numeral's value

        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // Check if the current value is less than the previous value
            if (currentValue < prevValue) {
                total -= currentValue; // Subtract it
            } else {
                total += currentValue; // Add it
            }

            // Update previous value
            prevValue = currentValue;
        }

        return total;
    }
}