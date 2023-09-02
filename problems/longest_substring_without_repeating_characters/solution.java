class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.isEmpty()) {
            return 0;
        }
        char[] letters = s.toCharArray();
        int[] numberOfLetters = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            numberOfLetters[i] = getNumber(letters, i);
        }
        return Arrays.stream(numberOfLetters).max().getAsInt();
    }

    private static int getNumber(char[] letters, int number) {
        Set<Character> uniqChars = new HashSet<>();
        int count = 0;
        for (int i = number; i < letters.length; i++) {
            if (uniqChars.contains(letters[i])) {
                break;
            }
            uniqChars.add(letters[i]);
            count++;
        }
        return count;
    }
}