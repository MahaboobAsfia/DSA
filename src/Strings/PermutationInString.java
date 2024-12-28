class PermutationInstring {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count the frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }

            // Add the next character to the window
            s2Count[s2.charAt(i) - 'a']++;
            // Remove the first character of the previous window
            s2Count[s2.charAt(i - s1.length()) - 'a']--;
        }

        // Check the last window
        return Arrays.equals(s1Count, s2Count);
    }
}