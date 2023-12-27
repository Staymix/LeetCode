class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equalsIgnoreCase(sb.toString());
    }
}