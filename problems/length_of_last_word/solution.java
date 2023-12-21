class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("  ", " ");
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}