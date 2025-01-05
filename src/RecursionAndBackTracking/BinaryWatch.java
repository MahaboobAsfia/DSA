class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        // Start backtracking with hour and minute set to 0
        backtrack(result, turnedOn, 0, 0, 0);
        return result;
    }

    private static void backtrack(List<String> result, int turnedOn, int hour, int minute, int index) {
        // Base case: too many "on" LEDs
        if (hour > 11 || minute > 59) return;

        // If the number of "on" LEDs is zero, record the time
        if (turnedOn == 0) {
            result.add(String.format("%d:%02d", hour, minute));
            return;
        }

        // Explore each LED
        for (int i = index; i < 10; i++) {
            if (i < 4) { // First 4 LEDs represent hours
                backtrack(result, turnedOn - 1, hour | (1 << i), minute, i + 1);
            } else { // Last 6 LEDs represent minutes
                backtrack(result, turnedOn - 1, hour, minute | (1 << (i - 4)), i + 1);
            }
        }
    }
}