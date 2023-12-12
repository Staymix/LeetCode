class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int one = x;
        int two = 0;
        int count;
        while (true) {
            count = x % 10;
            x /= 10;
            two += count;
            if (x == 0) break;
            two *= 10;
        }
        return two == one;
    }
}