class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are not equal, they cannot be isomorphic
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replace = t.charAt(i);

            if (!map.containsKey(original)) {
                // If the character in `t` is already mapped to another character in `s`, return false
                if (map.containsValue(replace)) {
                    return false;
                }
                // Otherwise, create a new mapping
                map.put(original, replace);
            } else {
                // If the character is already mapped, check if it maps to the correct character
                char mapped = map.get(original);
                if (mapped != replace) {
                    return false;
                }
            }
        }
        return true; // If all characters are mapped correctly, return true
    }
}