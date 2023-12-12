class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] strings = s.split("");
        Set<String> set = new TreeSet<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if (set.contains(strings[j])) {
                    set = new TreeSet<>();
                    count = 0;
                    break;
                }
                set.add(strings[j]);
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}