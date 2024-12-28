class ParanthesesDepth {
    public int maxDepth(String s) {
        int currentDepth = 0; // Tracks the current depth of nested parentheses
        int maxDepth = 0;     // Tracks the maximum depth encountered

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;          // Increase depth for opening parentheses
                maxDepth = Math.max(maxDepth, currentDepth); // Update max depth
            } else if (c == ')') {
                currentDepth--;          // Decrease depth for closing parentheses
            }
        }
        return maxDepth;
    }
}